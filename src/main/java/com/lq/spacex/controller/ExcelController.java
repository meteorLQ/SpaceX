package com.lq.spacex.controller;

import cn.idev.excel.FastExcel;
import com.lq.spacex.domain.dto.UploadData;
import com.lq.spacex.service.impl.UploadDataListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/excel")
@Slf4j
public class ExcelController {
    @PostMapping("/upload")
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("请选择一个文件上传！");
        }

        try {
            FastExcel.read(file.getInputStream(), UploadData.class, new UploadDataListener()).sheet().doRead();
            return ResponseEntity.ok("文件上传并处理成功！");
        } catch (IOException e) {
            log.error("文件处理失败", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("文件处理失败！");
        }
    }
}
