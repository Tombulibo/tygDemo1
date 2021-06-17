package com.tyg.service.impl;

import com.tyg.entity.User;
import com.tyg.dao.UserDao;
import com.tyg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User find(String user_name){
        return userRepository.find(user_name);
    }
}
