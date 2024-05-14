package turatbek.tor.springproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import turatbek.tor.springproject.dtos.CustomUserDetails;
import turatbek.tor.springproject.model.User;
import turatbek.tor.springproject.repository.UserRepository;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AtomicReference<UserDetails> userDetails = new AtomicReference<>();
        Optional<User> optionalUser = userRepository.findByUsername(username);
        optionalUser.ifPresentOrElse(
                user -> userDetails.set(new CustomUserDetails(user)),
                ()->{
                    throw new UsernameNotFoundException(
                            String.format("User with username: %s not found", username));
                });
        return userDetails.get();
    }
}