package IntegracionBackFront.backfront.Models.DTO.Users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter @Getter @ToString @EqualsAndHashCode
public class UserDTO {

    private Long id;
    //Validar valores con código
    private String nombre;
    //Validar valores con código
    private String apellido;
    @Email(message = "El correo debe tener un formato valido")
    private String correo;
    @Size(min = 8, message = "La contrasena debe ser un minimo de 8 caracteres")
    private String contrasena;
    @PastOrPresent(message = "La fecha no puede ser futura")
    private LocalDate fechaRegistro;
    @Positive(message = "El valor proporcionado debe ser positivo y valido")
    private Long idTipoUsuario;

    //Campo adicional
    private String nombreTipoUsuario;
/**
 * solucionar error ya que no permite iniciar sesión porque no estoy
 * proporcionando valores para todos los atributos.
 */
}
