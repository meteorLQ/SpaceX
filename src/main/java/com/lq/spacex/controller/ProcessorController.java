package com.lq.spacex.controller;

import com.lq.spacex.service.impl.ProcessorServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processor")
public class ProcessorController {

    @Resource
    private ProcessorServiceImpl processorService;


    @GetMapping("/createSnapdragonCPUInfo")
    public void createSnapdragonCPUInfo() {
        processorService.createSnapdragonCPUInfo();
    }

    @GetMapping("/createGetOtherCPUInfo")
    public void createGetOtherCPUInfo() {
        processorService.createGetOtherCPUInfo();
    }

    @GetMapping("/getIndex")
    public void getIndex() {
        processorService.getIndex();
    }

    @GetMapping("/query")
    public void query() {
        processorService.query();
    }

}