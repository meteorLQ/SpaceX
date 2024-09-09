package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XDictType;

/**
 * <p>
 * 字典类型表 服务类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
public interface ISysDictTypeService extends IService<XDictType> {
    PageInfo<XDictType> list(XDictType sysDictType);

}
