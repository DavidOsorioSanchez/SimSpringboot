package riwi.simulacro_filtro.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssingnmentsResponse {
  private Long id;
  private String assingnmentsTitle;
  private String description;
  private LocalDateTime dueDate;
  private LessonsResponse lessons;
}
