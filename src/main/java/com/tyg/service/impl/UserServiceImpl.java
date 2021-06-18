package com.tyg.service.impl;

import com.tyg.pojo.User;
import com.tyg.dao.IUserDao;
import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @Override
    public User getUserByName(String username){
        return userDao.getUserByName(username);
    }

    @Override
    public int updateUser(User user){
        return userDao.updateUser(user);
    }

    @Override
    public int addUser(User user){
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(User user){
        return userDao.deleteUser(user);
    }
}
