package com.tyg.dao;

import com.tyg.pojo.User;

import java.util.List;

public interface IUserDao {

    public List<User> getUsers();
    public User getUserByName(String username);
    int updateUser(User user);
    int addUser(User user);
    int deleteUser(User user);
}
