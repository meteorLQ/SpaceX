package com.lq.spacex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testC")
public class TestController {


    @GetMapping("/test")
    public  void test(){
        System.out.println("1111");
        System.out.println("1111");
    }
}
