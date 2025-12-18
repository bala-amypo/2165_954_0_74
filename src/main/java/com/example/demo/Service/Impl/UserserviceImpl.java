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
    private Userrepository userrepository;

    @Override
    public User createUser(User user) {
        return userrepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userrepository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        User existing = getUserById(id);
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        return userrepository.save(existing);
    }

    @Override
    public void deleteUser(Long id) {
        userrepository.deleteById(id);
    }
}
