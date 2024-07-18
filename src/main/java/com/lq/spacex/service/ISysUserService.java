package com.lq.spacex.service;


import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.SysUser;

/**
 * 用户 业务层
 *
 * @author ruoyi
 */
public interface ISysUserService {
    /**
     * 根据条件分页查询用户列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    PageInfo<SysUser> selectUserList(SysUser sysUser);


    SysUser getByUid(String id);
}
