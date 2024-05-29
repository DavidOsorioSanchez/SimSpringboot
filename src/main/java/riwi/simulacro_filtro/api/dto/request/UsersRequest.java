package riwi.simulacro_filtro.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacro_filtro.util.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersRequest {
  @NotNull(message = "El nombre no puede ser nulo")
  @NotBlank(message = "El nombre es requerido")
  private String userName;
  @NotNull(message = "La contraseña no puede ser nulo")
  @NotBlank(message = "La contraseña es requerido")
  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$", message = "La contraseña no es valida")
  private String password;
  @Size(min = 10, message = "el email minimo tiene que tener 10 caracteres")
  @Email(message = "El email es invalido")
  @NotNull(message = "El email es requerido")
  private String email;
  @NotBlank(message = "El nombre es requerido")
  private String fullName;
  @NotBlank(message = "El role es requerido")
  @NotNull(message = "El role no puede ser nulo")
  private Role role;
}
