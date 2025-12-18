package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.Userrepository;
import com.example.demo.Service.Userservice;

@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private Userrepository userRepository;

    // ✅ CREATE
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // ✅ READ (by id)
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // ✅ READ (all)
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ UPDATE
    @Override
    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        }

        return null;
    }

    // ✅ DELETE
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
