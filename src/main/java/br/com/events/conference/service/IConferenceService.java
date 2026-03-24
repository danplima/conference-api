package br.com.events.conference.service;

import br.com.events.conference.model.Conference;

import java.util.List;

public interface IConferenceService {
    public Conference addConferece(Conference conference);
    public Conference getConfereceById(Long id);
    public List<Conference> getAllConferences();
}
