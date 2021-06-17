package com.tyg.service;

import com.tyg.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User find(String user_name);
}
