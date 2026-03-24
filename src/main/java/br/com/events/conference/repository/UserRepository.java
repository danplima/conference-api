package br.com.events.conference.repository;

import br.com.events.conference.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepository extends ListCrudRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
