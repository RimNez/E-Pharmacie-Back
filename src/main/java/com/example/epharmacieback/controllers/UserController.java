package com.example.epharmacieback.controllers;

import com.example.epharmacieback.models.User;
import com.example.epharmacieback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public User login (@RequestBody User user) {
        return service.findByEmailAndPassword(user);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public User save(@RequestBody User entity) {
        return service.save(entity);
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable("id")  Long aLong) {
        return service.findById(aLong);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody User entity) {
        service.delete(entity);
    }
}
