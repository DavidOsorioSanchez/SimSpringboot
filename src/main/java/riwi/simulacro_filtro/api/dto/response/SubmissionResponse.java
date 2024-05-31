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
  private Long id;
  private String content;
  private LocalDateTime submissionDate;
  private double grade;
  private UsersResponse user;
  private AssingnmentsResponse assingnment;
}
