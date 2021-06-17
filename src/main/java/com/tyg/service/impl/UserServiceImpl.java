package com.tyg.service.impl;

import com.tyg.pojo.User;
import com.tyg.dao.UserDao;
import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }

    @Override
    public User find(String user_name){
        return userDao.find(user_name);
    }
}
