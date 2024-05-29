package riwi.simulacro_filtro.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagesResponse {
  private String menssageContent;
  private String sentMessage;
  private UserToSender sender_id;
  private UserToReciever receiver_id;
  private CoursesResponse courses_id;
}
