package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.AssingnmentsRequest;
import riwi.simulacro_filtro.api.dto.response.AssingnmentsResponse;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.IAssingnments;

public class AssingnmentsService implements IAssingnments{

  @Override
  public AssingnmentsResponse create(AssingnmentsRequest request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public AssingnmentsResponse get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public AssingnmentsResponse update(AssingnmentsRequest request, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<AssingnmentsResponse> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }
  
}
