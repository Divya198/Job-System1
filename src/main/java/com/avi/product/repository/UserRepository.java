package com.avi.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.product.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
