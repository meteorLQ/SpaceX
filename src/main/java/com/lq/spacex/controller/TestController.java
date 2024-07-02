package com.lq.spacex.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.lq.spacex.domain.entity.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testC")
public class TestController {


    @GetMapping("/test")
    public  void test(){
        Role role = Role.builder().roleName("测试").roleId(1l).build();
        String jsonString = JSON.toJSONString(role);
        System.out.println("jsonString = " + jsonString);
        System.out.println("jsonString = " + jsonString);

        System.out.println("jsonString = " + jsonString);
    }
}
