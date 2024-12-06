package com.lq.spacex.controller;

import com.lq.spacex.domain.dto.Processor;
import com.lq.spacex.service.impl.ProcessorServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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

    @GetMapping("/query/{type}")
    public List<Processor> query(@PathVariable String type) {
       return processorService.queryByType(type);
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
         processorService.deleteById(id);
    }

    @GetMapping("/deleteByIdIndex/{id}")
    public void deleteByIdIndex(@PathVariable String id) {

        processorService.deleteById(id,"my-index");
    }

}
