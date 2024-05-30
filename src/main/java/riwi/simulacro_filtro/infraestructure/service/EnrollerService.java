package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.EnrollerRequest;
import riwi.simulacro_filtro.api.dto.response.EnrollerResponse;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.IEnroller;

public class EnrollerService implements IEnroller{

  @Override
  public EnrollerResponse create(EnrollerRequest request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public EnrollerResponse get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public EnrollerResponse update(EnrollerRequest request, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<EnrollerResponse> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }
  
}
