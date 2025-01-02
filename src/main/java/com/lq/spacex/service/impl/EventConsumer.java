package com.lq.spacex.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    @KafkaListener(topics = {"hello-topic"},groupId = "hello-group")
    public void consume(String message) {
        System.out.println("读取到的message = " + message);
    }
}
