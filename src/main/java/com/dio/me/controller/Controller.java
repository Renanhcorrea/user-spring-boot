package com.dio.me.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.me.model.User;
import com.dio.me.service.UserService;

@RestController
@RequestMapping ("/users")
public class Controller {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id){
        service.deleteUserById(id);
    }
} 
