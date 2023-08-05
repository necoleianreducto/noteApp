package com.exam.noteApp.service;

import com.exam.noteApp.entity.User;
import com.exam.noteApp.respository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        user.setId(new Random().nextInt());
        return userRepository.saveAndFlush(user);
    }
}
