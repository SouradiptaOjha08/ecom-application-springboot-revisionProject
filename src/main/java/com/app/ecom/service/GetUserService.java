package com.app.ecom.service;

import com.app.ecom.entity.User;
import com.app.ecom.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserService {

    private final UserRepository userRepository;

    public GetUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }
}
