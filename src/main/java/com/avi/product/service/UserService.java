package com.avi.product.service;

import com.avi.product.dto.UserRegistrationDto;
import com.avi.product.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    User save(UserRegistrationDto userRegistrationDto);
}
