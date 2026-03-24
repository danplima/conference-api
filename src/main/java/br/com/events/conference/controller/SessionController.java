package br.com.events.conference.controller;

import br.com.events.conference.model.Session;
import br.com.events.conference.service.ISessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {
    private ISessionService service;

    public SessionController(ISessionService service) {
        this.service = service;
    }

    @PostMapping("/session")
    public ResponseEntity<Session> addSession(@RequestBody Session session) {
        return ResponseEntity.status(201).body(service.addSession(session));
    }

    @GetMapping("session/{id}")
    public ResponseEntity<Session> getSessionById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getSessionById(id));
    }
}
