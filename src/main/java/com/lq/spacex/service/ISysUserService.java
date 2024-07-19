package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ISysUserService extends IService<SysUser> {
    PageInfo<SysUser> list(SysUser sysUser);

    SysUser getByUserId(String userId);
}
