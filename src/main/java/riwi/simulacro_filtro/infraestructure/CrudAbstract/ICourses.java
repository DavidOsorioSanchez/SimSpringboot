package riwi.simulacro_filtro.infraestructure.CrudAbstract;

import riwi.simulacro_filtro.api.dto.request.CoursesRequest;
import riwi.simulacro_filtro.api.dto.response.CoursesResponse;

public interface ICourses extends CrudService<CoursesRequest, CoursesResponse, Long> {
  
}
