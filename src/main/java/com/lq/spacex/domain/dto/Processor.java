package com.lq.spacex.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处理器
 *
 * @author LQ
 * @date 2021/03/05 9:21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Processor {
    private String id;
    /**
     * 处理器型号
     */
    private String type;

    /**
     * 制造工艺
     */
    private String madeCraft;
    /**
     * cpu架构
     */
    private String cpuFrame;
    /**
     * 核心频率
     */
    private String coreFrequency;
    /**
     * GPU
     */
    private String gpu;
    /**
     * 内存
     */
    private String ram;
    /**
     * 基带
     */
    private String BaseBand;
    /**
     * 出货时间
     */
    private String deliveryTime;
    /**
     * 代表机型
     */
    private String deputyPhone;
}