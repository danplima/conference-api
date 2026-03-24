package br.com.events.conference.service;

import br.com.events.conference.exception.NotFoundException;
import br.com.events.conference.model.Session;
import br.com.events.conference.model.User;
import br.com.events.conference.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements ISessionService{
    private SessionRepository repository;

    public SessionServiceImpl(SessionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Session addSession(Session session) {
        return repository.save(session);
    }

    @Override
    public Session getSessionById(Long id) {
        return repository.findById(id).orElseThrow(()->new NotFoundException("Session "+id+" not found"));
    }

    @Override
    public List<Session> getAllSessions() {
        return repository.findAll();
    }


}
