package com.lq.spacex.service.impl;

import cn.idev.excel.context.AnalysisContext;
import cn.idev.excel.event.AnalysisEventListener;
import com.alibaba.fastjson2.JSON;
import com.lq.spacex.domain.dto.UploadData;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class UploadDataListener extends AnalysisEventListener<UploadData> {
    private final List<UploadData> list = new ArrayList<>();

    @Override
    public void invoke(UploadData data, AnalysisContext context) {
        log.info("解析到一条数据: {}", JSON.toJSONString(data));
        list.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");
        // 在此处可以进行数据的存储操作，如保存到数据库
    }
}
