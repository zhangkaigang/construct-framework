package com.zhangkaigang.service;

import com.zhangkaigang.pojo.User;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/4/7
 * @Version:1.0
 */
public interface UserService {

    User findById(User user);

    List<User> getUserList();

    void saveUser(User user);
}
