package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XRole;
import com.lq.spacex.mapper.XRoleMapper;
import com.lq.spacex.service.IXRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@Service
public class XRoleServiceImpl extends ServiceImpl<XRoleMapper, XRole> implements IXRoleService {

    @Override
    public List<XRole> selectRoleList(XRole role) {
        return List.of();
    }

    @Override
    public PageInfo<XRole> list(XRole xRole) {
        LambdaQueryChainWrapper<XRole> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(xRole.getRoleName()), XRole::getRoleName, xRole.getRoleName());
        lambdaQuery.eq(StringUtils.isNotBlank(xRole.getStatus()), XRole::getStatus, xRole.getStatus());
        return new PageInfo<>(lambdaQuery.list());
    }
}
