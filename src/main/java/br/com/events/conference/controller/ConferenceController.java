package br.com.events.conference.controller;

import java.util.List;

import br.com.events.conference.model.Conference;
import br.com.events.conference.service.IConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConferenceController {
    IConferenceService service;

    public ConferenceController(IConferenceService service) {
        this.service = service;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addSession(@RequestBody Conference conference) {
        return ResponseEntity.status(201).body(service.addConferece(conference));
    }

    @GetMapping("/conferences")
    public ResponseEntity<List<Conference>> getAllConferences() {
        return ResponseEntity.ok(service.getAllConferences());
    }

    @GetMapping("/conferences/{id}")
    public ResponseEntity<Conference> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getConfereceById(id));
    }
}
