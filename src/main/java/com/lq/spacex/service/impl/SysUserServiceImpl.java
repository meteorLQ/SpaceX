package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;

import com.lq.spacex.domain.entity.XUser;
import com.lq.spacex.mapper.SysUserMapper;
import com.lq.spacex.service.ISysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, XUser> implements ISysUserService {


    @Override
    public PageInfo<XUser> list(XUser sysUser) {
        LambdaQueryChainWrapper<XUser> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysUser.getUserName()), XUser::getUserName, sysUser.getUserName());
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getPhonenumber()), XUser::getPhonenumber, sysUser.getPhonenumber());
        PageInfo<XUser> pageInfo = new PageInfo<>(lambdaQuery.list());
        List<XUser> collect = pageInfo.getList().stream().map(cbaySysUser -> CompletableFuture.supplyAsync(() -> {
            return cbaySysUser;
        })).toList().stream().map(CompletableFuture::join).collect(Collectors.toList());
        pageInfo.setList(collect);

        return pageInfo;
    }

    @Override
    @Cacheable(cacheNames = {"sysUser"},key = "#userId")
    public XUser getByUserId(String userId) {
        return this.getById(userId);
    }
}
