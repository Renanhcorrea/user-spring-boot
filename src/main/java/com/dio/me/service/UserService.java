package com.dio.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.me.model.User;
import com.dio.me.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public Optional<User> getUserById(Integer id){
        return repository.findById(id);
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public void deleteUserById(Integer id){
        repository.deleteById(id);
    }
}

