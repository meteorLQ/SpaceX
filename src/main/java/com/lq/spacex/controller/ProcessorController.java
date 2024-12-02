package com.lq.spacex.controller;

import com.lq.spacex.service.impl.ProcessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/processor")
public class ProcessorController {

    @Autowired
   private ProcessorServiceImpl processorService;

   @GetMapping("/getSnapdragonCPUInfo")
   public void getSnapdragonCPUInfo()  {
       try {
           processorService.getSnapdragonCPUInfo();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

    @GetMapping("/getOtherCPUInfo")
    public void getOtherCPUInfo()  {
        try {
            processorService.getOtherCPUInfo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
