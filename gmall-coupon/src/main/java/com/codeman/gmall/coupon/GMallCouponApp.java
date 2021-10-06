package com.codeman.gmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2021/10/6 15:41
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.codeman.gmall.coupon.mapper")
public class GMallCouponApp {

    public static void main(String[] args) {
        SpringApplication.run(GMallCouponApp.class, args);
    }
}
