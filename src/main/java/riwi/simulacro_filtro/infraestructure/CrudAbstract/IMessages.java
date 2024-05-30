package riwi.simulacro_filtro.infraestructure.CrudAbstract;

import riwi.simulacro_filtro.api.dto.request.MessagesRequest;
import riwi.simulacro_filtro.api.dto.response.MessagesResponse;

public interface IMessages extends CrudService<MessagesRequest, MessagesResponse, Long>{
  
}
