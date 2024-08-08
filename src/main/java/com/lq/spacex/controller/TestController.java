package com.lq.spacex.controller;

import com.alibaba.fastjson2.JSON;
import com.lq.spacex.domain.entity.Role;
import com.lq.spacex.service.TestService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testC")
@Slf4j
public class TestController {
    @Resource
    TestService testService;
    @GetMapping("/test")
    public void test() {
        Role role = Role.builder().roleName("测试").roleId(1l).build();
        String jsonString = JSON.toJSONString(role);
        log.info("jsonString: " + jsonString);
    }

    public static void main(String[] args) {
        String str="gz11089.zhaoshengbing";
        System.out.println("jsonString = " + str.length());
    }
}

