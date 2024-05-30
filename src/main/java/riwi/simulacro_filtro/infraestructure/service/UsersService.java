package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.UsersRequest;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.IUser;

public class UsersService implements IUser {

  @Override
  public UsersResponse create(UsersRequest request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public UsersResponse get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public UsersResponse update(UsersRequest request, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<UsersResponse> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }
  
}
