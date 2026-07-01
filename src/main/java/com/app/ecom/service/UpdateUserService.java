package com.app.ecom.service;

import com.app.ecom.entity.User;
import com.app.ecom.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UpdateUserService {

    private final UserRepository userRepository;
    private final GetUserService getUserService;

    public UpdateUserService(UserRepository userRepository, GetUserService getUserService) {
        this.userRepository = userRepository;
        this.getUserService = getUserService;
    }

    public User updateUser(Long id, User updated) {
        User user = getUserService.getUserById(id);
        user.setName(updated.getName());
        user.setEmail(updated.getEmail());
        user.setPassword(updated.getPassword());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
