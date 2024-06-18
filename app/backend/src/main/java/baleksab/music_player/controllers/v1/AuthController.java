package baleksab.music_player.controllers.v1;

import baleksab.music_player.dtos.UserDto;
import baleksab.music_player.dtos.requests.auth.RegistrationDto;
import baleksab.music_player.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public UserDto register(@Valid @RequestBody RegistrationDto registrationDto) {
        return authService.registerUser(registrationDto);
    }

}