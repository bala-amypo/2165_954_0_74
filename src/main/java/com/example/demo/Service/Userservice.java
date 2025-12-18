package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface Userservice {

    // ✅ CREATE
    User createUser(User user);

    // ✅ READ (by id)
    User getUserById(Long id);

    // ✅ READ (all)
    List<User> getAllUsers();

    // ✅ UPDATE
    User updateUser(Long id, User user);

    // ✅ DELETE
    void deleteUser(Long id);
}
