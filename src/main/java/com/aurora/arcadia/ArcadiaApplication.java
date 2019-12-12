package com.aurora.arcadia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@MapperScan(basePackages = {"com.aurora.arcadia.mapper"})
@MapperScan("com.aurora.arcadia.mapper")
public class ArcadiaApplication {

    //启动spring
    public static void main(String[] args) {
        SpringApplication.run(ArcadiaApplication.class, args);
        System.out.println("***************************************************************************");
        System.out.println("**********************************启动成功**********************************");
        System.out.println("***************************************************************************");
    }

}
