package riwi.simulacro_filtro.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoursesResponse {
  private String coursesName;
  private String description;
  private List<UsersResponse> teacher;
}
