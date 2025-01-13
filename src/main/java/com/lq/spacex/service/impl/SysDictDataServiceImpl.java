package com.lq.spacex.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.utils.DictUtils;
import com.lq.spacex.domain.entity.XDictData;
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
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, XDictData> implements ISysDictDataService {

    @Override
    public PageInfo<XDictData> list(XDictData sysDictData) {
        LambdaQueryChainWrapper<XDictData> lambdaQuery = this.lambdaQuery();
        lambdaQuery.like(StringUtils.isNotBlank(sysDictData.getDictType()), XDictData::getDictType, sysDictData.getDictType());
        lambdaQuery.eq(StringUtils.isNotBlank(sysDictData.getDictLabel()), XDictData::getDictLabel, sysDictData.getDictLabel());
        lambdaQuery.eq(StringUtils.isNotBlank(sysDictData.getDictValue()), XDictData::getDictValue, sysDictData.getDictValue());
        return new PageInfo<>(lambdaQuery.list());
    }

    @Override
    public List<XDictData> selectDictDataByType(String dictType) {
        return this.lambdaQuery().eq(XDictData::getDictType, dictType).list();
    }

    @Override
    public List<XDictData> selectCacheDictDataByType(String dictType) {
        List<XDictData> dictCache = DictUtils.getDictCache(dictType);
        return dictCache;
    }

    @Override
    public List<XDictData> selectDictDataByTypeAndValue(String dictType, String dictValue) {
        return this.lambdaQuery().eq(XDictData::getDictType, dictType).eq(XDictData::getDictValue,dictValue).list();
    }
}
