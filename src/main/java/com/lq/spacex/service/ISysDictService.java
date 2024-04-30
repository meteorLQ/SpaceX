package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.spacex.domain.entity.SysDict;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
public interface ISysDictService extends IService<SysDict> {

    /**
     * 查询字典数据
     *
     * @param sysDict 查询条件
     * @return
     */
    List<SysDict> list(SysDict sysDict);

    /**
     * 根据字典类型id获取字典数据
     *
     * @param dictTypeCd 字典类型id
     * @return
     */
    List<SysDict> getByDictTypeCd(String dictTypeCd);


    SysDict getDictTypeCdAndDictCd(SysDict sysDict);
}
