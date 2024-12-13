package com.lq.spacex.controller;

import jakarta.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("/test")
    public void test (){
        kafkaTemplate.send("hello-topic","hello");
    }
}
