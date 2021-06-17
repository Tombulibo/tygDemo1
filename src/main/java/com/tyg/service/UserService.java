package com.tyg.service;

import com.tyg.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User find(String user_name);
}
