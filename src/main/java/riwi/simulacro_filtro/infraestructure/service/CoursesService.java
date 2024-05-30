package riwi.simulacro_filtro.infraestructure.service;

import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.CoursesRequest;
import riwi.simulacro_filtro.api.dto.response.CoursesResponse;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.ICourses;

public class CoursesService implements ICourses{

  @Override
  public CoursesResponse create(CoursesRequest request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public CoursesResponse get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public CoursesResponse update(CoursesRequest request, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<CoursesResponse> getAll(int page, int size) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }
  
}
