package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.spacex.domain.entity.User;
import com.lq.spacex.mapper.UserMapper;
import com.lq.spacex.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
