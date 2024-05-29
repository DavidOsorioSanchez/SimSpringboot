package riwi.simulacro_filtro.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
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
public class EnrollerRequest {
  @FutureOrPresent(message = "La fecha no puede ser del pasado")
  @NotBlank(message = "La fecha es requerida")
  private LocalDateTime enrollerDate;

  @NotNull(message = "El id de user no puede ser nula")
  private Long user_id;
  @NotNull(message = "El id de course no puede ser nula")
  private Long course_id;
}
