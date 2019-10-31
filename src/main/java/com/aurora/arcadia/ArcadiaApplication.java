package com.aurora.arcadia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(value = "com.aurora.arcadia.mapper")
@SpringBootApplication
public class ArcadiaApplication {

    //启动spring
    public static void main(String[] args) {
        SpringApplication.run(ArcadiaApplication.class, args);
    }

}
