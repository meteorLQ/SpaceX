package com.lq.spacex.domain.entity;


//import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@TableName("x_role")
public class Role  {
    /**
     * 角色ID
     */
//    @TableId("role_id")
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限
     */
    private String roleKey;

    /**
     * 角色排序
     */
    private Integer roleSort;

    /**
     * 数据范围（1：所有数据权限；2：自定义数据权限；3：本部门数据权限；4：本部门及以下数据权限；5：仅本人数据权限）
     */
    private String dataScope;

    /**
     * 菜单树选择项是否关联显示（ 0：父子不互相关联显示 1：父子互相关联显示）
     */
//    @TableField(exist = false)
    private boolean menuCheckStrictly;

    /**
     * 部门树选择项是否关联显示（0：父子不互相关联显示 1：父子互相关联显示 ）
     */
//    @TableField(exist = false)
    private boolean deptCheckStrictly;

    /**
     * 角色状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
//    private String delFlag;

    /**
     * 用户是否存在此角色标识 默认不存在
     */
//    @TableField(exist = false)
//    private boolean flag = false;
    /**
     * 菜单组
     */
//    @Singular
//    @TableField(exist = false)
//    private List menuIds;
//    /**
//     * 部门组（数据权限）
//     */
//    @Singular
//    @TableField(exist = false)
//    private List deptIds;
//    /**
//     * 角色菜单权限
//     */
//    @Singular
//    @TableField(exist = false)
//    private Set<String> permissions;





}
