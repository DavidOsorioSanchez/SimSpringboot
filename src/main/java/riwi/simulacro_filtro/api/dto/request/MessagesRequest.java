package riwi.simulacro_filtro.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessagesRequest {
  @NotBlank(message = "El mensaje es requerido")
  @NotNull(message = "El mensaje no puede ser nulo")
  private String menssageContent;
  private String sentMessage;

  @NotNull(message = "El id de sender no puede ser nulo")
  private Long sender_id;
  @NotNull(message = "El id de reciever no puede ser nulo")
  private Long receiver_id;
  @NotNull(message = "El id de courses no puede ser nulo")
  private Long courses_id;
}
