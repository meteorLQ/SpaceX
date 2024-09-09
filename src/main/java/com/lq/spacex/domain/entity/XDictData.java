package com.lq.spacex.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 字典数据表
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@Getter
@Setter
@TableName("x_dict_data")
public class XDictData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典编码
     */
    @TableId("dict_code")
    private Long dictCode;

    /**
     * 字典排序
     */
    @TableField("dict_sort")
    private Integer dictSort;

    /**
     * 字典标签
     */
    @TableField("dict_label")
    private String dictLabel;

    /**
     * 字典键值
     */
    @TableField("dict_value")
    private String dictValue;

    /**
     * 字典类型
     */
    @TableField("dict_type")
    private String dictType;

    /**
     * 样式属性（其他样式扩展）
     */
    @TableField("css_class")
    private String cssClass;

    /**
     * 表格回显样式
     */
    @TableField("list_class")
    private String listClass;

    /**
     * 是否默认（Y是 N否）
     */
    @TableField("is_default")
    private String isDefault;

    /**
     * 状态（0正常 1停用）
     */
    @TableField("status")
    private String status;

    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;
}
