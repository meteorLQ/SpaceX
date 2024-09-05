package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ISysUserService extends IService<XUser> {
    PageInfo<XUser> list(XUser sysUser);

    XUser getByUserId(String userId);
}
