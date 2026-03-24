package br.com.events.conference.service;

import br.com.events.conference.exception.NotFoundException;
import br.com.events.conference.model.Conference;
import br.com.events.conference.repository.ConferenceRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceService{

    private ConferenceRepository repository;

    public ConferenceServiceImpl(ConferenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conference addConferece(Conference conference) {
        return repository.save(conference);
    }

    @Override
    public Conference getConfereceById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Conferece "+id+"not found"));
    }

    @Override
    public List<Conference> getAllConferences() {
        return repository.findAll();
    }
}
