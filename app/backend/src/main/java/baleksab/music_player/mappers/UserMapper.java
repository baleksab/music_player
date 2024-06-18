package baleksab.music_player.mappers;

import baleksab.music_player.dtos.UserDto;
import baleksab.music_player.dtos.requests.auth.RegistrationDto;
import baleksab.music_player.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User user);

    User registrationDtoToUser(RegistrationDto registrationDto);

}
