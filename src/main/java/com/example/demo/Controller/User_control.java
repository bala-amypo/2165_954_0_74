package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.User;
import com.example.demo.Service.Userservice;

@RestController
@RequestMapping("/users")
public class User_control {

    @Autowired
    private Userservice userservice;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userservice.createUser(user);
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userservice.getUserById(id);
    }

    // READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userservice.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userservice.deleteUser(id);
        return "User deleted successfully";
    }
}
