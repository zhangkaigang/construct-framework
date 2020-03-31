package com.zhangkaigang.test;

import com.zhangkaigang.dao.UserDao;
import com.zhangkaigang.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
public class TestMybatis {

    /**
     * 测试映射类
     * @throws Exception
     */
    @Test
    public void testMybatis() throws Exception{
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        // 查询所有数据
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        // 关闭资源
        session.close();
        in.close();
    }

    /**
     * 测试映射文件
     * @throws Exception
     */
    @Test
    public void testMybatis2() throws Exception{
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.findOne();
        System.out.println(user);
        // 关闭资源
        session.close();
        in.close();
    }

}
