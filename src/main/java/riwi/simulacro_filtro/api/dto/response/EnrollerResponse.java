package riwi.simulacro_filtro.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollerResponse {
  private Long id;
  private LocalDateTime enrollerDate;
  private CoursesResponse user;
  private CoursesResponse course;
}
