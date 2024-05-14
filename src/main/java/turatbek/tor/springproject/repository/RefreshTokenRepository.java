package turatbek.tor.springproject.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import turatbek.tor.springproject.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Integer> {
    Optional<RefreshToken> findByToken(String token);
}