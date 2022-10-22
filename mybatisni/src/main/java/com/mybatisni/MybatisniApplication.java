package com.mybatisni;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.mybatisni.dao")
public class MybatisniApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisniApplication.class, args);
    }

}
