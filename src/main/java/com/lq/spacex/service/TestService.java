package com.lq.spacex.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {
    @Async
    public  void test(){
        System.out.println("1 = " );
            int i=1/0;

//      throw new ServiceException("111");
    };
}
