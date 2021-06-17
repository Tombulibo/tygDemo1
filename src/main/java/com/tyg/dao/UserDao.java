package com.tyg.dao;

import com.tyg.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();
    public User find(String user_name);
}
