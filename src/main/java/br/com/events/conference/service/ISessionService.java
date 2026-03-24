package br.com.events.conference.service;

import br.com.events.conference.model.Session;

import java.util.List;

public interface ISessionService {
    Session addSession(Session session);
    Session getSessionById(Long id);
    List<Session> getAllSessions();
}
