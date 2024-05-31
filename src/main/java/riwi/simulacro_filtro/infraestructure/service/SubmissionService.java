package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import lombok.AllArgsConstructor;
import riwi.simulacro_filtro.api.dto.request.SubmissionRequest;
import riwi.simulacro_filtro.api.dto.response.AssingnmentsResponse;
import riwi.simulacro_filtro.api.dto.response.SubmissionResponse;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;
import riwi.simulacro_filtro.domain.entities.Assingnments;
import riwi.simulacro_filtro.domain.entities.Submissions;
import riwi.simulacro_filtro.domain.entities.Users;
import riwi.simulacro_filtro.domain.repositories.AssingnmentsRepository;
import riwi.simulacro_filtro.domain.repositories.SubmissionRepository;
import riwi.simulacro_filtro.domain.repositories.UserRepository;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.ISubmission;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class SubmissionService implements ISubmission{

  @Autowired
  private final SubmissionRepository submissionRepository;

  @Autowired
  private final AssingnmentsRepository assingnmentsRepository;

  @Autowired
  private final UserRepository userRepository;

  @Override
  public SubmissionResponse create(SubmissionRequest request) {
    Assingnments assingnments = this.assingnmentsRepository.findById(request.getAssingnment_id())
        .orElseThrow(() -> new BadRequestException(messageError.idNotFound("assingnment")));

    Users users = this.userRepository.findById(request.getUser_id())
        .orElseThrow(() -> new BadRequestException(messageError.idNotFound("user")));

    Submissions submissions = this.requestToEntity(request);

    submissions.setAssingnments(assingnments);
    submissions.setUsers(users);

    return this.entityToResponseSubmission(this.submissionRepository.save(submissions));
  }

  @Override
  public SubmissionResponse get(Long id) {
    return this.entityToResponseSubmission(this.find(id));
  }

  @Override
  public SubmissionResponse update(SubmissionRequest request, Long id) {

    Submissions submissions = this.requestToEntity(request);

    submissions.setId(id);

    return this.entityToResponseSubmission(this.submissionRepository.save(submissions));
  }

  @Override
  public void delete(Long id) {
    Submissions submissions = this.find(id);
    this.submissionRepository.delete(submissions);
  }

  @Override
  public Page<SubmissionResponse> getAll(int page, int size) {
    if (page < 0){page = 0;}
    PageRequest pagination = PageRequest.of(page, size);
    return this.submissionRepository.findAll(pagination).map(this::entityToResponseSubmission);
  }

  private Submissions find(Long id){
    return this.submissionRepository.findById(id)
        .orElseThrow(() -> new BadRequestException(messageError.idNotFound("Submission")));
  }
  
  private Submissions requestToEntity(SubmissionRequest request) {
    return Submissions.builder()
        .content(request.getContent())
        .submissionDate(request.getSubmissionDate())
        .grade(request.getGrade())
        .build();
  }

  private SubmissionResponse entityToResponseSubmission(Submissions entity){

        AssingnmentsResponse assingnments = new AssingnmentsResponse();
        BeanUtils.copyProperties(entity.getAssingnments(), assingnments);

        UsersResponse users = new UsersResponse();
        BeanUtils.copyProperties(entity.getUsers(), users);

        return SubmissionResponse.builder()
                    .id(entity.getId())
                    .content(entity.getContent())
                    .submissionDate(entity.getSubmissionDate())
                    .grade(entity.getGrade())
                    .assingnment(assingnments)
                    .user(users)
                    .build();
  }
}
