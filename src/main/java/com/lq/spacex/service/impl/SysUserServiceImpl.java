package com.lq.spacex.service.impl;


import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.SysUser;
import com.lq.spacex.mapper.SysUserMapper;
import com.lq.spacex.service.ISysUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService
{
    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);




    /**
     * 根据条件分页查询用户列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @Override
    public PageInfo<SysUser> selectUserList(SysUser sysUser)
    {
        LambdaQueryChainWrapper<SysUser> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysUser.getUserName()), SysUser::getUserName, sysUser.getUserName());
        lambdaQuery.eq(StringUtils.isNotBlank(sysUser.getPhonenumber()), SysUser::getPhonenumber, sysUser.getPhonenumber());
        PageInfo<SysUser> pageInfo = new PageInfo<>(lambdaQuery.list());
        return pageInfo;
    }

    /**
     * 根据条件分页查询已分配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */






}
