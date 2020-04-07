package com.zhangkaigang.service.impl;

import com.zhangkaigang.dao.UserDao;
import com.zhangkaigang.pojo.User;
import com.zhangkaigang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/4/7
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(User user) {
        return userDao.selectByPrimaryKey(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.selectAll();
    }

    @Override
    public void saveUser(User user) {
        int i = 1/0;
        userDao.insert(user);
    }
}
