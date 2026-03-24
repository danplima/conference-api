package br.com.events.conference.service;

import br.com.events.conference.model.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public User getUserById(Long id);
    public User getUserByEmail(String email);
    public List<User> getAllUsers();
}
