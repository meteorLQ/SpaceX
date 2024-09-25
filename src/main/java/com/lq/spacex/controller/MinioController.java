package com.lq.spacex.controller;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.exception.ServiceException;
import com.lq.spacex.service.impl.MinioService;
import io.minio.ListObjectsArgs;
import io.minio.MinioClient;
import io.minio.Result;
import io.minio.messages.Item;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class MinioController extends BaseController {

    @Autowired
    MinioClient minioClient;

    @Autowired
    MinioService minioService;

    @Value("${minio.bucketName}")
    String bucketName;

    @PostMapping("/uploadFile")
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile[] file)

    {
//        String bizPath = request.getParameter("biz");
        if (file == null || file.length == 0) {
            return ResponseEntity.success("请选择文件后上传！");
        }
        Multimap<@Nullable Object, @Nullable Map<String, String>> multimap = ArrayListMultimap.create();
        HashMap<@Nullable String, @Nullable String> map = Maps.newHashMapWithExpectedSize(file.length);
        Arrays.stream(file).forEach(f -> {
           // FileUtils.picketFileHead(f);

            if (f.isEmpty()) {
                log.error("文件不能为空");
                throw new ServiceException("文件不能为空");
            }
            String url = minioService.uploadFile(f);
            map.put(f.getOriginalFilename(), url);
        });
        multimap.put(bucketName, map);
        return ResponseEntity.success("上传成功！", multimap.asMap());
    }


    @DeleteMapping("/deleteFile/{fileName}")
    public ResponseEntity deleteFile(@PathVariable("fileName") String fileName) {
        minioService.deleteFile(fileName);
        return ResponseEntity.success("删除成功!");

    }

    @GetMapping("/downloadFile/{fileName}")
    public void downloadFile(@PathVariable("fileName") String fileName, HttpServletResponse response) {
        minioService.downloadFile(fileName, response);
    }

    @GetMapping("listObjects")
    public void listObjects() {
        Iterable<Result<Item>> results = minioClient.listObjects(ListObjectsArgs.builder().bucket(bucketName).build());
        results.forEach(itemResult -> {

            try {
                log.info(itemResult.get().objectName());
            } catch (Exception e) {

                throw new RuntimeException(e);
            }

        });
    }
}
