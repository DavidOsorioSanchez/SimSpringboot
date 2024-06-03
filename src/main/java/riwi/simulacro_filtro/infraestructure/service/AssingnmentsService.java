package riwi.simulacro_filtro.infraestructure.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import riwi.simulacro_filtro.api.dto.request.AssingnmentsRequest;
import riwi.simulacro_filtro.api.dto.request.UsersRequest;
import riwi.simulacro_filtro.api.dto.response.AssingnmentsResponse;
import riwi.simulacro_filtro.api.dto.response.LessonsResponse;
import riwi.simulacro_filtro.api.dto.response.SubmissionResponse;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;
import riwi.simulacro_filtro.domain.entities.Assingnments;
import riwi.simulacro_filtro.domain.entities.Lessons;
import riwi.simulacro_filtro.domain.entities.Users;
import riwi.simulacro_filtro.domain.repositories.AssingnmentsRepository;
import riwi.simulacro_filtro.domain.repositories.LessonRepository;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.IAssingnments;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class AssingnmentsService implements IAssingnments{

  @Autowired
  private final AssingnmentsRepository assingnmentsRepository;

  @Autowired
  private  final LessonRepository lessonRepository;

  @Override
  public AssingnmentsResponse create(AssingnmentsRequest request) {
    Lessons lessons = this.lessonRepository.findById(request.getLessons_id()).orElseThrow(() -> new BadRequestException(messageError.idNotFound("lessons")));

    Assingnments assingnments = this.requestToEntity(request);
    assingnments.setLessons(lessons);
    return this.entityToResponseAssingnments(this.assingnmentsRepository.save(assingnments));
  }

  @Override
  public AssingnmentsResponse get(Long id) {
    return this.entityToResponseAssingnments(this.find(id));
  }

  @Override
  public AssingnmentsResponse update(AssingnmentsRequest request, Long id) {
    Assingnments assingnments = this.requestToEntity(request);
    assingnments.setId(id);
    return this.entityToResponseAssingnments(this.assingnmentsRepository.save(assingnments));
  }

  @Override
  public void delete(Long id) {
    Assingnments assingnments = this.find(id);
    this.assingnmentsRepository.delete(assingnments);
  }

  @Override
  public Page<AssingnmentsResponse> getAll(int page, int size) {
    if (page <0){page = 0;}
    PageRequest pagination = PageRequest.of(page, size);
    return this.assingnmentsRepository.findAll(pagination).map(this::entityToResponseAssingnments);
  }

  private Assingnments find(Long id) {
    return this.assingnmentsRepository.findById(id)
            .orElseThrow(() -> new BadRequestException(messageError.idNotFound("assingnaments")));
  }

  private Assingnments requestToEntity(AssingnmentsRequest request) {
    return Assingnments.builder()
            .assingnmentsTitle(request.getAssingnmentsTitle())
            .description(request.getDescription())
            .dueDate(request.getDueDate())
            .build();
  }

  private AssingnmentsResponse entityToResponseAssingnments(Assingnments entity) {

    LessonsResponse lessons = new LessonsResponse();
    BeanUtils.copyProperties(entity.getLessons(), lessons);

    return AssingnmentsResponse.builder()
            .id(entity.getId())
            .assingnmentsTitle(entity.getAssingnmentsTitle())
            .description(entity.getDescription())
            .dueDate(entity.getDueDate())
            .lessons(lessons)
            .build();
  }
}
