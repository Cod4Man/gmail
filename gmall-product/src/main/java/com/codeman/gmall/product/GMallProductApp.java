package com.codeman.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/10/6 15:56
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.codeman.gmall.product.mapper")
public class GMallProductApp {

    public static void main(String[] args) {
        SpringApplication.run(GMallProductApp.class, args);
    }
}
