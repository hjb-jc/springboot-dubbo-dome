package com.gk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gk.dao.UserDao;
import com.gk.entity.User;
import com.gk.service.UserService;

import java.util.List;

@Service(version = "1.0.1")
public class UserServiceImpl implements UserService {
    public List<User> findAll() {
        return UserDao.getUserList();
    }
}
