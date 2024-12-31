package com.example.spring_boot_first_app.repository;

import com.example.spring_boot_first_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed
}
