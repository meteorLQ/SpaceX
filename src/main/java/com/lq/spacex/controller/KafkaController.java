package com.lq.spacex.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/kafka")
@Slf4j
public class KafkaController {

    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("/test")
    public void test (){
        kafkaTemplate.send("hello-topic","hello");
    }

    @GetMapping("/testFuture")
    public void testFuture (){
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("hello-topic", "hello");
        try {
            SendResult<String, String> stringStringSendResult = future.get();
            future.thenApply(c->{
                ProducerRecord<String, String> producerRecord = c.getProducerRecord();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log.info("异步执行：{}", LocalDate.now());
                return producerRecord;
            });
            log.info("异步后执行：{}", LocalDate.now());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
