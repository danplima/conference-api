package repo;

import model.Session;
import model.Subscription;
import model.SubscriptionID;
import model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByUser(User user);
    public List<Subscription> findBySession(Session session);
}
