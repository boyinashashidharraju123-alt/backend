package com.klu.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.klu.model.User;
import com.klu.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // Student/Admin Register
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.registerUser(user);
    }

    // Login
    @PostMapping("/login")
    public User login(@RequestBody Map<String, String> body) {
        return service.loginUser(
            body.get("username"),
            body.get("password")
        );
    }
}