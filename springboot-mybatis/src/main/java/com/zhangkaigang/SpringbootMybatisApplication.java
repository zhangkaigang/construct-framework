package com.zhangkaigang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableTransactionManagement(proxyTargetClass = true) // 扫描mapper
@MapperScan(basePackages = "com.zhangkaigang.dao")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})// 使用druid data source，排除默认的datasource
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
