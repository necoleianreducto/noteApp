package com.exam.noteApp.controller;

import com.exam.noteApp.entity.User;
import com.exam.noteApp.links.UserLink;
import com.exam.noteApp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping(path = UserLink.LIST_USERS)
    public ResponseEntity<?> listUsers() {
        log.info("UsersController:  list users");
        List<User> resource = userService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = UserLink.ADD_USER)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        log.info("UsersController:  list users");
        User resource = userService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
