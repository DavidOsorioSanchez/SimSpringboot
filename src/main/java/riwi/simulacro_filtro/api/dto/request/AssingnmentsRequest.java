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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssingnmentsRequest {
  @NotBlank(message = "La asignatura nesecita un titulo")
  @NotNull(message = "El nombre de la asignatura no puede ser nulo")
  private String assingnmentsTitle;
  private String description;
  @FutureOrPresent(message = "La fecha no puede ser del pasado")
  @NotBlank(message = "La fecha es requerida")
  private LocalDateTime dueDate;
  @NotNull(message = "El id de leccíones no puede ser nulo")
  private Long lessons_id;
}
