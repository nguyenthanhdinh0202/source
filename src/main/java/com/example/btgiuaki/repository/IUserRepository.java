package com.example.demo.repository;

import com.example.demo.model.User;

public interface IUserRepository {
    User findByUsername(String username);
}
