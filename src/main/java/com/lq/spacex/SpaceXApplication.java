package com.lq.spacex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lq.spacex.mapper")
public class SpaceXApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaceXApplication.class, args);
    }

}
