package br.com.events.conference.service;

import br.com.events.conference.model.Session;
import br.com.events.conference.model.Subscription;
import br.com.events.conference.model.User;
import br.com.events.conference.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private SubscriptionRepository repository;

    public SubscriptionServiceImpl(SubscriptionRepository repo) {
        this.repository = repo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreateAt(LocalDateTime.now());
        subscription.setUniqueId(UUID.randomUUID().toString());
        return repository.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return repository.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return repository.findByIdSession(session);
    }
}
