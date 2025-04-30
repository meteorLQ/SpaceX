package com.lq.spacex.controller;

import com.lq.spacex.domain.entity.XRole;
import com.lq.spacex.service.TestService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/testC")
@Slf4j
public class TestController {
    @Resource
    TestService testService;

    @GetMapping("/test")
    public void test() {
        XRole.builder().roleName("测试").id(1L).build();
        XRole.builder().roleName("测试").id(1L).build();
        read();
    }

    @Async
    public void read(){
        log.info("read");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("异步：{}",Thread.currentThread());
    }
}

