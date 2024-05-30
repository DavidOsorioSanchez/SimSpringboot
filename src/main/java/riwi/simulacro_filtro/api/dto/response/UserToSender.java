package riwi.simulacro_filtro.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacro_filtro.util.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserToSender {
  private String userName;
  private String email;
  private String fullName;
  private Role role;
}
