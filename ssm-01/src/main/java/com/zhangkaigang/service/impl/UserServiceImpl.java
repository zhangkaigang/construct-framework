package com.zhangkaigang.service.impl;

import com.zhangkaigang.domain.User;
import com.zhangkaigang.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        System.out.println("业务层：查询所有...");
        return null;
    }
}
