package com.zhangkaigang.dao;

import com.zhangkaigang.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
public interface UserDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from t_user")
    List<User> findAll();

    /**
     * 查询一个
     * @return
     */
    User findOne();
}
