package com.zhangkaigang.dao;

import com.zhangkaigang.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/3/31
 * @Version:1.0
 */
@Repository
public interface UserDao extends Mapper<User> {

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


    @Insert("insert into t_user(username, age) values (#{username}, #{age})")
    void saveUser(User user);
}
