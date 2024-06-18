package baleksab.music_player.services;

import baleksab.music_player.dtos.UserDto;
import baleksab.music_player.dtos.requests.auth.RegistrationDto;
import baleksab.music_player.mappers.UserMapper;
import baleksab.music_player.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Autowired
    public AuthService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDto registerUser(RegistrationDto registrationDto) {
        var user = userRepository.save(userMapper.registrationDtoToUser(registrationDto));

        return userMapper.userToUserDto(user);
    }

}
