package com.tyg.service;

import com.tyg.pojo.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();
    public User getUserByName(String user_name);
    int updateUser(User user);
    int addUser(User user);
    int deleteUser(User user);
}
