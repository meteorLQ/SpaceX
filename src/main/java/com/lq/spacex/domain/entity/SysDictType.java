package com.lq.spacex.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lq.spacex.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 字典类型表
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@TableName("sys_dict_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysDictType extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典主键
     */
    private Long id;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典类型
     */
    private String dictType;

    /**
     * 状态（0正常 1停用）
     */
//    private String status;
}
