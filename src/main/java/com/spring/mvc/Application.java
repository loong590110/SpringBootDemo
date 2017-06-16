package com.spring.mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@SpringBootApplication
@MapperScan("com.spring.mvc.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Starting My Application...");
    }
}
