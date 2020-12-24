package com.zhangkaigang.controller;

import com.zhangkaigang.domain.User;
import com.zhangkaigang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有");
        // 调用service方法
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user.toString());
        }
        model.addAttribute("name", "findAll");
        return "test";
    }

    @RequestMapping("/findOne")
    public String findOne(Model model){
        System.out.println("表现层：查询一个");
        // 调用service方法
        User user = userService.findOne();
        System.out.println(user.toString());
        model.addAttribute("name", "findOne");
        return "test";
    }
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        System.out.println("表现层：查询所有");
        // 调用service方法
        List<User> userList = userService.selectAll();
        model.addAttribute("list", userList);
        model.addAttribute("name", "selectAll");
        return "test";
    }

    @RequestMapping("/save")
    public String saveUser(Model model){
        System.out.println("表现层：新增");
        User user = new User();
        user.setUsername("张三");
        userService.saveUser(user);
        model.addAttribute("name", "save");
        return "test";
    }

}
