package com.lq.spacex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XDictData;

import java.util.List;

/**
 * <p>
 * 字典数据表 服务类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
public interface ISysDictDataService extends IService<XDictData> {
    PageInfo<XDictData> list(XDictData sysDictData);


    List<XDictData> selectDictDataByType(String dictType);
    List<XDictData> selectCacheDictDataByType(String dictType);
}
