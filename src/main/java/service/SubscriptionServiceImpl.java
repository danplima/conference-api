package service;

import model.Subscription;
import model.User;
import org.springframework.stereotype.Service;
import repo.SubscriptionRepo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private SubscriptionRepo repo;

    public SubscriptionServiceImpl(SubscriptionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreateAt(LocalDateTime.now());
        subscription.setUniqueId(UUID.randomUUID().toString());
        return repo.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return List.of();
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return List.of();
    }
}
