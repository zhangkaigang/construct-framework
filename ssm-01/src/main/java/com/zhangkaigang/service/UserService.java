package com.zhangkaigang.service;

import com.zhangkaigang.domain.User;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
public interface UserService {

    List<User> findAll();

    User findOne();

    void saveUser(User user);
}
