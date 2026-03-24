package br.com.events.conference.repository;

import br.com.events.conference.model.Session;
import br.com.events.conference.model.Subscription;
import br.com.events.conference.model.SubscriptionID;
import br.com.events.conference.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
