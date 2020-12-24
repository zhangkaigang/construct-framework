package com.zhangkaigang.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:TODO
 * @Author:zhang.kaigang
 * @Date:2020/4/7
 * @Version:1.0
 */
@Table(name = "t_user")
public class User {

    @Id
    private Integer id;
    private String username;
    private Integer age;

    /**
     * 通用mapper会将驼峰命名的属性转为下划线字段，所以以下的loginName也可以不写column注解
     * 可以参照https://www.cnblogs.com/softidea/p/6049285.html学习
     */
    @Column(name = "login_name")
    private String loginName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
