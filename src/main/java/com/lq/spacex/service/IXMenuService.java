package com.lq.spacex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.spacex.domain.entity.XMenu;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author LQ
 * @since 2024-08-19
 */
public interface IXMenuService extends IService<XMenu> {
    List<XMenu> list(XMenu xMenu);
}
