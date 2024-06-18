package baleksab.music_player.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {

    private long id;

    private String username;

    private String password;

    private String email;

}
