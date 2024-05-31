package riwi.simulacro_filtro.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonsResponse {
  private Long id;
  private String lessonsTitle;
  private String content;
  private CoursesResponse course;
}
