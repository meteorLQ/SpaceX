package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.spacex.domain.entity.XMenu;
import com.lq.spacex.mapper.XMenuMapper;
import com.lq.spacex.service.IXMenuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2024-08-19
 */
@Service
public class XMenuServiceImpl extends ServiceImpl<XMenuMapper, XMenu> implements IXMenuService {

    @Override
    public List<XMenu> list(XMenu xMenu) {
        LambdaQueryChainWrapper<XMenu> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(xMenu.getMenuName()), XMenu::getMenuName, xMenu.getMenuName());
        lambdaQuery.eq(StringUtils.isNotBlank(xMenu.getStatus()), XMenu::getStatus, xMenu.getStatus());
        return list(lambdaQuery);
    }
}
