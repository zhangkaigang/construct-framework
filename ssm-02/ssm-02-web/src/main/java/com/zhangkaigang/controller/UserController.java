package com.zhangkaigang.controller;

import com.zhangkaigang.pojo.User;
import com.zhangkaigang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/4/7
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{userId}")
    @ResponseBody
    public User findById(@PathVariable(value = "userId") Integer userId){
        User user = new User();
        user.setId(userId);
        return userService.findById(user);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUserList(){
        List<User> userList = userService.getUserList();
        return userService.getUserList();
    }

    @RequestMapping("/save")
    @ResponseBody
    public void saveUser(){
        User user = new User();
        user.setUsername("王五");
        userService.saveUser(user);
    }
}
