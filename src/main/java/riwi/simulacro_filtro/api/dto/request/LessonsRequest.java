package riwi.simulacro_filtro.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonsRequest {
  @NotNull(message = "la lección nesecita un titulo")
  private String lessonsTitle;
  private String content;
  @NotNull(message = "El id de cursos no puede ser nulo")
  private Long course_id;
}
