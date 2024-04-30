package com.lq.spacex.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LQ
 * @since 2022-03-15
 */
@TableName("x_sys_dict")
@Data
@Builder
public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键同字典值
     */
    @TableId("\"DICT_ID\"")
//    @NotBlank(message = "字典值不能为空")
    private String dictId;

    /**
     * 字典类型id
     */
    @TableField("\"DICT_TYPE_CD\"")
    @NotBlank(message = "字典类型ID不能为空")
    private String dictTypeCd;

    /**
     * 字典值
     */
    @TableField("\"DICT_CD\"")
    private String dictCd;

    /**
     *字典值英文描述
     */
    @TableField("\"DICT_EN_DESC\"")
    @NotBlank(message = "字典值英文描述不能为空")
    private String dictEnDesc;

    /**
     *字典值中文描述
     */
    @TableField("\"DICT_CN_DESC\"")
    @NotBlank(message = "字典值中文描述不能为空")
    private String dictCnDesc;

    /**
     *是否启用标志位（预留）
     */
    @TableField("\"VALID_IND\"")
    private String validInd;



}
