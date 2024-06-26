package turatbek.tor.springproject.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterUserDto {
    private String email;
    private String username;
    private String password;
    private String fullName;
}
