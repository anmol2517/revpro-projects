package org.example.bootjpa.controller;

import org.example.bootjpa.entity.User;
import org.example.bootjpa.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping
    public java.util.List<User> getAll() {
        return repo.findAll();
    }
}
