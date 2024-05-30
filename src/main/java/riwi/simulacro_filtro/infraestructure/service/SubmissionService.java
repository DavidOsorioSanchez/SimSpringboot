package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.SubmissionRequest;
import riwi.simulacro_filtro.api.dto.response.SubmissionResponse;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.ISubmission;

public class SubmissionService implements ISubmission{

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
  
}
