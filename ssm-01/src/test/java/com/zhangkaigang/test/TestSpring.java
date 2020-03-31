package com.zhangkaigang.test;

import com.zhangkaigang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
public class TestSpring {

    /**
     * 测试spring框架
     */
    @Test
    public void springTest(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        UserService userService = (UserService)ac.getBean("userService");
        // 调用方法
        userService.findAll();
    }

}
