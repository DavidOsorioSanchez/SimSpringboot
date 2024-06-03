package riwi.simulacro_filtro.infraestructure.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import riwi.simulacro_filtro.api.dto.request.AssingnmentsRequest;
import riwi.simulacro_filtro.api.dto.request.CoursesRequest;
import riwi.simulacro_filtro.api.dto.response.AssingnmentsResponse;
import riwi.simulacro_filtro.api.dto.response.CoursesResponse;
import riwi.simulacro_filtro.api.dto.response.LessonsResponse;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;
import riwi.simulacro_filtro.domain.entities.Assingnments;
import riwi.simulacro_filtro.domain.entities.Courses;
import riwi.simulacro_filtro.domain.repositories.AssingnmentsRepository;
import riwi.simulacro_filtro.domain.repositories.CoursesRepository;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.ICourses;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class CoursesService implements ICourses{

  @Autowired
  private final CoursesRepository coursesRepository;

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

  private Courses find(Long id) {
    return this.coursesRepository.findById(id)
            .orElseThrow(() -> new BadRequestException(messageError.idNotFound("courses")));
  }

  private Courses requestToEntity(CoursesRequest request) {
    return Courses.builder()
            .coursesName(request.getCoursesName())
            .description(request.getDescription())
            .build();
  }

  private CoursesResponse entityToResponseCouses(Courses entity) {

    UsersResponse teacher = new UsersResponse();
    BeanUtils.copyProperties(entity.getTeacher(), teacher);

    return CoursesResponse.builder()
            .id(entity.getId())
            .coursesName(entity.getCoursesName())
            .description(entity.getDescription())
            .teacher(teacher)
            .build();
  }
}
