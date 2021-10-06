package com.codeman.gmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/10/6 15:07
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.codeman.gmall.order.mapper")
public class GMallOrderApp {

    public static void main(String[] args) {
        SpringApplication.run(GMallOrderApp.class, args);
    }
}
