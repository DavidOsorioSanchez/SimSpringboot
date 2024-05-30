package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import lombok.AllArgsConstructor;
import riwi.simulacro_filtro.api.dto.request.SubmissionRequest;
import riwi.simulacro_filtro.api.dto.response.SubmissionResponse;
import riwi.simulacro_filtro.domain.entities.Submissions;
import riwi.simulacro_filtro.domain.repositories.SubmissionRepository;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.ISubmission;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class SubmissionService implements ISubmission{

  @Autowired
  private final SubmissionRepository submissionRepository;
  @Override
  public SubmissionResponse create(SubmissionRequest request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public SubmissionResponse get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public SubmissionResponse update(SubmissionRequest request, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<SubmissionResponse> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

  private Submissions find(Long id){
    return this.submissionRepository.findById(id)
        .orElseThrow(() -> new BadRequestException(messageError.ifNotFound("Submission")));
  }
  
}
