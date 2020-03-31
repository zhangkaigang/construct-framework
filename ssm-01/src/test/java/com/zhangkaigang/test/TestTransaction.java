package com.zhangkaigang.test;

import com.zhangkaigang.dao.UserDao;
import com.zhangkaigang.domain.User;
import com.zhangkaigang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestTransaction {

    @Autowired
    private UserService userService;

    /**
     * 测试事务
     */
    @Test
    public void saveUserTest(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(13);
        int i = 1/0;
        userService.saveUser(user);
    }

}
