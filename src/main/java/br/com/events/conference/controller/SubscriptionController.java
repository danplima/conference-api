package br.com.events.conference.controller;

import br.com.events.conference.model.Session;
import br.com.events.conference.model.Subscription;
import br.com.events.conference.model.User;
import br.com.events.conference.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {
    private ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(service.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{id}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable Long id) {
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(service.getAllByUser(user));
    }

    @GetMapping("/subscriptions/session/{id}")
    public ResponseEntity<List<Subscription>> getBySession(@PathVariable Long id) {
        Session session = new Session();
        session.setIdSession(id);
        return ResponseEntity.ok(service.getAllBySession(session));
    }
}
