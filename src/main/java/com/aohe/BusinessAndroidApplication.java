package com.aohe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aohe.dao")
public class BusinessAndroidApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessAndroidApplication.class, args);
    }

}
