package turatbek.tor.springproject.service;
import turatbek.tor.springproject.dtos.RegisterUserDto;
import turatbek.tor.springproject.dtos.UserDTO;
import turatbek.tor.springproject.mappers.UserMapper;
import turatbek.tor.springproject.model.User;
import turatbek.tor.springproject.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final UserMapper userMapper;


    public AuthenticationService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            UserMapper userMapper
    ) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public UserDTO signup(RegisterUserDto registrationDTO) {
        User user = User.builder()
                .email(registrationDTO.getEmail())
                .fullName(registrationDTO.getFullName())
                .username(registrationDTO.getUsername())
                .password(passwordEncoder.encode(registrationDTO.getPassword()))
                .build();
        User savedUser = userRepository.save(user);
        return userMapper.userToUserDto(savedUser);
    }
}