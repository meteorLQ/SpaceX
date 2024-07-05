package com.lq.spacex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("com.lq.spacex.mapper")
@EnableAsync
public class SpaceXApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaceXApplication.class, args);
    }

}
