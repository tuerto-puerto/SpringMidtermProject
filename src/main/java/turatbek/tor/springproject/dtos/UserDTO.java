package turatbek.tor.springproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import turatbek.tor.springproject.model.User;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    private String name;

    private String username;

    private String email;

    public UserDTO(User user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

}