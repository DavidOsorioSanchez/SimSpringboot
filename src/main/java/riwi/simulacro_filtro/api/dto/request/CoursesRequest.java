package riwi.simulacro_filtro.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesRequest {
  @NotNull(message = "El curso tiene que tener nombre")
  private String coursesName;
  private String description;
  @NotNull(message = "El id teacher no puede ser nulo")
  private Long teacher_id;
}
