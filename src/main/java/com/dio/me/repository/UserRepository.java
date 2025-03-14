package com.dio.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.me.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
