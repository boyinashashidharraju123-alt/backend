package com.klu.service;

import org.springframework.stereotype.Service;
import com.klu.model.User;
import com.klu.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // Register
    public User registerUser(User user) {
        return repo.save(user);
    }

    // Login
    public User loginUser(String username, String password) {
        User user = repo.findByUsername(username).orElse(null);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}