package com.lq.spacex.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 角色和菜单关联表
 * </p>
 *
 * @author LQ
 * @since 2024-09-02
 */
@Getter
@Setter
@TableName("x_role_menu")
public class XRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId("role_id")
    private Long roleId;

    /**
     * 菜单ID
     */
    @TableId("menu_id")
    private Long menuId;
}
