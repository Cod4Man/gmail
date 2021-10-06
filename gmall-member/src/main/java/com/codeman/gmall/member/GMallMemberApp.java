package com.codeman.gmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/10/6 15:51
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.codeman.gmall.member.mapper")
public class GMallMemberApp {

    public static void main(String[] args) {
        SpringApplication.run(GMallMemberApp.class, args);
    }
}
