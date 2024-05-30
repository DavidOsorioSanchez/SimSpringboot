package riwi.simulacro_filtro.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionResponse {
  private String content;
  private LocalDateTime submissionDate;
  private double grade;
  private Long user_id;
  private Long assingnment_id;
}
