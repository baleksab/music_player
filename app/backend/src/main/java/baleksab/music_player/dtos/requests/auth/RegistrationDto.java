package baleksab.music_player.dtos.requests.auth;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistrationDto {

    @Email(message = "User must have a valid email.")
    private String email;

    @NotBlank(message = "First name must not be blank.")
    private String firstName;

    @NotBlank(message = "Last name must not be blank.")
    private String lastName;

    @NotBlank(message = "Password must not be blank.")
    @Size(min = 6, message = "Password must be at least 6 characters.")
    private String password;

}
