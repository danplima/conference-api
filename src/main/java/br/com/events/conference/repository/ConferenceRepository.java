package br.com.events.conference.repository;

import br.com.events.conference.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepository extends ListCrudRepository<Conference, Long> {
}
