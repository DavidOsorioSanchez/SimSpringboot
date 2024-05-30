package riwi.simulacro_filtro.infraestructure.CrudAbstract;

import riwi.simulacro_filtro.api.dto.request.UsersRequest;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;

public interface IUser extends CrudService<UsersRequest, UsersResponse, Long> {
  
}
