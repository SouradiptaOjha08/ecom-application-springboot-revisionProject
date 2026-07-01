package com.app.ecom.service;

import com.app.ecom.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserService {

    private final UserRepository userRepository;

    public DeleteUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
