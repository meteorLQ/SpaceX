package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lq.spacex.entity.XRoleMenu;
import com.lq.spacex.mapper.XRoleMenuMapper;
import com.lq.spacex.service.IXRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2024-09-02
 */
@Service
public class XRoleMenuServiceImpl extends ServiceImpl<XRoleMenuMapper, XRoleMenu> implements IXRoleMenuService {

}
