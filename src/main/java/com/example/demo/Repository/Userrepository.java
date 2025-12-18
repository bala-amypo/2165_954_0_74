package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {

    // ✅ Find user by email (useful for login / validation)
    Optional<User> findByEmail(String email);
}
