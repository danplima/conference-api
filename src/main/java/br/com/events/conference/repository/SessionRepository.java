package br.com.events.conference.repository;

import br.com.events.conference.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Long> {
}
