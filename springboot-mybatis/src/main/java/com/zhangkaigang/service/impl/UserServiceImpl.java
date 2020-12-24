package com.zhangkaigang.service.impl;

import com.zhangkaigang.dao.UserDao;
import com.zhangkaigang.domain.User;
import com.zhangkaigang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        System.out.println("业务层：查询所有...");
        return userDao.findAll();
    }

    public User findOne() {
        return userDao.findOne();
    }

    public List<User> selectAll() {
        return userDao.selectAll();
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }


}
