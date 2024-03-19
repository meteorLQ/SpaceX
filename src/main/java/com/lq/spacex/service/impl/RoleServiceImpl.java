package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.spacex.domain.entity.Role;
import com.lq.spacex.mapper.RoleMapper;
import com.lq.spacex.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
}
