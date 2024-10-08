package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XDictType;
import com.lq.spacex.mapper.SysDictTypeMapper;
import com.lq.spacex.service.ISysDictTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典类型表 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@Service
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, XDictType> implements ISysDictTypeService {

    @Override
    public PageInfo<XDictType> list(XDictType sysDictType) {
        LambdaQueryChainWrapper<XDictType> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysDictType.getDictType()), XDictType::getDictType, sysDictType.getDictType());
        lambdaQuery.eq(StringUtils.isNotBlank(sysDictType.getDictName()), XDictType::getDictName, sysDictType.getDictName());
        return new PageInfo<>(lambdaQuery.list());
    }
}
