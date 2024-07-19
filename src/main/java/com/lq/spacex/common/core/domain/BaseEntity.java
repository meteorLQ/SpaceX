package com.lq.spacex.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entity基类
 * 
 * @author LQ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 搜索值 */

//    private String searchValue;

    /** 创建者 */
    private String createBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /** 更新者 */
    private String updateBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /** 备注 */
//    private String remark;

    /** 请求参数 */
//    private Map<String, Object> params;

//    public String getSearchValue()
//    {
//        return searchValue;
//    }
//
//    public void setSearchValue(String searchValue)
//    {
//        this.searchValue = searchValue;
//    }
//    public String getRemark()
//    {
//        return remark;
//    }
//
//    public void setRemark(String remark)
//    {
//        this.remark = remark;
//    }
//
//    public Map<String, Object> getParams()
//    {
//        if (params == null)
//        {
//            params = new HashMap<>();
//        }
//        return params;
//    }
//
//    public void setParams(Map<String, Object> params)
//    {
//        this.params = params;
//    }
}
