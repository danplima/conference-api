package br.com.events.conference.service;

import br.com.events.conference.exception.NotFoundException;
import br.com.events.conference.model.User;
import br.com.events.conference.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User addUser(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repository.findById(id).orElseThrow(()-> new NotFoundException("User" +id+"not found"));
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() -> new NotFoundException("User" +email+"not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
