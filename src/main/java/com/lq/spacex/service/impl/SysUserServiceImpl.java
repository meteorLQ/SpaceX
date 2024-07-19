package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;

import com.lq.spacex.domain.entity.SysUser;
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
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {


    @Override
    public PageInfo<SysUser> list(SysUser sysUser) {
        LambdaQueryChainWrapper<SysUser> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysUser.getUserName()), SysUser::getUserName, sysUser.getUserName());
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getPhonenumber()), SysUser::getPhonenumber, sysUser.getPhonenumber());
        PageInfo<SysUser> pageInfo = new PageInfo<>(lambdaQuery.list());
        List<SysUser> collect = pageInfo.getList().stream().map(cbaySysUser -> CompletableFuture.supplyAsync(() -> {
            return cbaySysUser;
        })).collect(Collectors.toList()).stream().map(CompletableFuture::join).collect(Collectors.toList());
        pageInfo.setList(collect);

        return pageInfo;
    }

    @Override
    @Cacheable(cacheNames = {"sysUser"},key = "#userId")
    public SysUser getByUserId(String userId) {
        return this.getById(userId);
    }
}
