package br.com.events.conference.service;

import br.com.events.conference.model.Session;

import java.util.List;

public interface ISessionService {
    public Session addSession(Session session);
    public Session getSessionById(Long id);
    public List<Session> getAllSessions();
}
