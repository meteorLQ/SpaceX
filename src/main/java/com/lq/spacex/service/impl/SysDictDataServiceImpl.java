package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.utils.DictUtils;
import com.lq.spacex.domain.entity.SysDictData;
import com.lq.spacex.mapper.SysDictDataMapper;
import com.lq.spacex.service.ISysDictDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 字典数据表 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements ISysDictDataService {

    @Override
    public PageInfo<SysDictData> list(SysDictData sysDictData) {
        LambdaQueryChainWrapper<SysDictData> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysDictData.getDictType()), SysDictData::getDictType, sysDictData.getDictType());
        lambdaQuery.eq(StringUtils.isNotBlank(sysDictData.getDictLabel()), SysDictData::getDictLabel, sysDictData.getDictLabel());
        lambdaQuery.eq(StringUtils.isNotBlank(sysDictData.getDictValue()), SysDictData::getDictValue, sysDictData.getDictValue());
        return new PageInfo<>(lambdaQuery.list());
    }

    @Override
    public List<SysDictData> selectDictDataByType(String dictType) {
        return this.lambdaQuery().eq(SysDictData::getDictType, dictType).list();
    }

    @Override
    public List<SysDictData> selectCacheDictDataByType(String dictType) {
        List<SysDictData> dictCache = DictUtils.getDictCache(dictType);
        return dictCache;
    }
}
