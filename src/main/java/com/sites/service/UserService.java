package com.sites.service;

import com.sites.entity.User;
import com.sites.mapper.UserMapper;
import com.sites.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserImpl {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserInfo(String userId) {
        User user = userMapper.queryUserInfo(userId);
        return user;
    }

    @Override
    public List queryMySites(String userId) {
        return userMapper.queryMySites(userId);
    }
}
