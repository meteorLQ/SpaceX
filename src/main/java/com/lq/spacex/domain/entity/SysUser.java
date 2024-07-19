package com.lq.spacex.domain.entity;


import com.lq.spacex.common.core.domain.BaseEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 用户对象 sys_user
 * 
 * @author LQ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private String id;

    /** 部门ID */
    private String deptId;

    /** 用户账号 */
    @NotBlank(message = "用户账号不能为空")
    @Size(min = 0, max = 30, message = "用户账号长度不能超过30个字符")
    private String userName;

    /** 用户昵称 */
    @Size(min = 0, max = 30, message = "用户昵称长度不能超过30个字符")
    private String nickName;

    /** 用户邮箱 */
    @Email(message = "邮箱格式不正确")
    @Size(min = 0, max = 50, message = "邮箱长度不能超过50个字符")
    private String email;

    /** 手机号码 */
    @Size(min = 0, max = 11, message = "手机号码长度不能超过11个字符")
    private String phonenumber;

    /** 用户性别 */
    private String sex;

    /** 用户头像 */
    private String avatar;

    /** 密码 */
    private String password;

    /** 帐号状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登录IP */
    private String loginIp;

    /** 最后登录时间 */
    private Date loginDate;
//    /** 角色组 */
//    private Long[] roleIds;
//
//    /** 岗位组 */
//    private Long[] postIds;

    /** 角色ID */
//    private Long roleId;
    public boolean isAdmin()
    {
        return isAdmin(this.id);
    }

    public static boolean isAdmin(String userId)
    {
        return userId != null && "1" .equals(userId) ;
    }
}
