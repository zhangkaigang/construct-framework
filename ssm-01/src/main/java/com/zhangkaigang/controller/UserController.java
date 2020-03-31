package com.zhangkaigang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：查询所有");
        return "list";
    }
}
