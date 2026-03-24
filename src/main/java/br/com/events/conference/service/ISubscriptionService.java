package br.com.events.conference.service;

import br.com.events.conference.model.Session;
import br.com.events.conference.model.Subscription;
import br.com.events.conference.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
