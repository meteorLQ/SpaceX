package com.lq.spacex.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lq.spacex.common.core.domain.BaseEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@TableName("x_user")
@Data
public class User extends BaseEntity{

//    @Delegate
//    @TableField(exist=false)
//    private BaseEntity baseEntity=new BaseEntity();

    @TableId("user_id")
    private  String userId;



    @NotBlank(message = "[userName]名称不能为空")
    private  String userName;


}
