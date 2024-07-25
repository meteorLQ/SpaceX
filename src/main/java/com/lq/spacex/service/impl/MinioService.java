package com.lq.spacex.service.impl;

import com.lq.spacex.common.exception.ServiceException;
import io.minio.*;
import io.minio.errors.ErrorResponseException;
import io.minio.http.Method;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

@Service
public class MinioService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    MinioClient minioClient;

    @Value("${minio.bucketName}")
    String bucketName;


    /**
     * minio文件上传
     *
     * @param file 文件
     * @return 文件链接
     */
    public String uploadFile(MultipartFile file) {
        try {
            if (!bucketExists(bucketName)) {
                logger.error("MinioService:桶:[{}]不存在,请新建!", bucketName);
                throw new ServiceException("当前桶不存在");
            }
            minioClient.putObject(PutObjectArgs.builder().bucket(bucketName)
                    .object(file.getOriginalFilename())
                    .stream(file.getInputStream(), file.getSize(), -1)
                    .contentType(file.getContentType()).build());
            String url = minioClient.getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder()
                    .method(Method.GET)
                    .bucket(bucketName)
                    .object(file.getOriginalFilename())
//                                    .expiry(60 * 60 * 24)
                    .build());
            return url;
        } catch (Exception e) {
            logger.error("MinioService:{}", e.getMessage(), e);
            throw new ServiceException(e.getMessage());
        }

    }

    /**
     * @param file       文件
     * @param bucketName 桶
     * @return
     */
    public String uploadFile(MultipartFile file, String bucketName) {
        try {
            minioClient.putObject(PutObjectArgs.builder().bucket(bucketName)
                    .object(file.getOriginalFilename())
                    .stream(file.getInputStream(), file.getSize(), -1)
                    .contentType(file.getContentType()).build());
            String url = minioClient.getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder()
                    .method(Method.GET)
                    .bucket(bucketName)
                    .object(file.getOriginalFilename())
//                                    .expiry(60 * 60 * 24)
                    .build());
            return url;
        } catch (Exception e) {
            logger.error("MinioService:{}", e.getMessage(), e);
            throw new ServiceException(e.getMessage());
        }
    }

    public void downloadFile(String fileName, HttpServletResponse response) {
        OutputStream outputStream = null;
        try {
            StatObjectResponse statObjectResponse = statObject(fileName);
            GetObjectResponse object = minioClient.getObject(GetObjectArgs.builder().bucket(bucketName).object(fileName).build());
//        response.setHeader(  statObjectResponse.headers(););
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
//        response.setContentType("application/octet-stream");
            response.setCharacterEncoding("utf-8");
            response.setContentType(statObjectResponse.contentType());
            outputStream = response.getOutputStream();
            byte buf[] = new byte[1024];
            int length;
            while ((length = object.read(buf)) > 0) {
                outputStream.write(buf, 0, length);
            }

        } catch (Exception e) {
            logger.error("MinioService:{}", e.getMessage(), e);
            throw new ServiceException(e.getMessage());
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    logger.error("MinioService:{}", e.getMessage(), e);
                    throw new ServiceException(e.getMessage());
                }

            }
        }

    }


    public void deleteFile(@NonNull String fileName) {
        try {
            if (objectExists(fileName)){
                minioClient.removeObject(RemoveObjectArgs.builder().bucket(bucketName).object(fileName).build());
            }
        } catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }
    }

    /**
     *  桶是否存在，存在返回true,不存在返回false
     * @param bucketName 桶名称
     * @return Boolean
     */
    private Boolean bucketExists(@NonNull String bucketName) {
        try {
            return minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build());
        } catch (Exception e) {
            logger.error("MinioService:{}", e.getMessage(), e);
            throw new ServiceException(e.getMessage());
        }
    }

    private Boolean objectExists(@NonNull String fileName) {
        try {
            StatObjectResponse statObjectResponse = minioClient.statObject(StatObjectArgs.builder()
                    .bucket(bucketName).object(fileName).build());
            if (statObjectResponse != null && statObjectResponse.size() > 0) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        } catch (ErrorResponseException errorResponseException) {
            logger.error("文件不存在:{}", errorResponseException.getMessage(),errorResponseException);
            throw new ServiceException("文件不存在");
        } catch (Exception e) {
            logger.error("文件下载异常:{}", e.getMessage(),e);
            throw new ServiceException("文件下载异常:" + e.getMessage());
        }
    }

    private StatObjectResponse statObject(@NonNull String fileName) {
        try {
            StatObjectResponse statObjectResponse = minioClient.statObject(StatObjectArgs.builder()
                    .bucket(bucketName).object(fileName).build());
            if (statObjectResponse==null||statObjectResponse.size()==0||statObjectResponse.deleteMarker()==Boolean.TRUE){
                throw new ServiceException("文件不存在或文件已删除！");
            }
            return statObjectResponse;
        } catch (ErrorResponseException errorResponseException) {
            logger.error("文件不存在:{}", errorResponseException.getMessage());
            throw new ServiceException("文件不存在");
        } catch (Exception e) {
            throw new ServiceException("文件异常:" + e.getMessage());
        }
    }


}
