package riwi.simulacro_filtro.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionRequest {
  @NotNull(message = "El contenido es requerido")
  private String content;
  @NotNull(message = "se nesecitala fecha de entrega")
  private LocalDateTime submissionDate;
  @DecimalMax("5.2")
  @NotNull(message = "La nota no puede ser nula")
  private double grade;
  @NotNull(message = "El id de usuario no puede ser nulo")
  private Long user_id;
  @NotNull(message = "El id de usuario no puede ser nulo")
  private Long assingnment_id;
}
