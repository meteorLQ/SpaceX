package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.SysDictType;
import com.lq.spacex.domain.entity.SysUser;

/**
 * <p>
 * 字典类型表 服务类
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
public interface ISysDictTypeService extends IService<SysDictType> {
    PageInfo<SysDictType> list(SysDictType sysDictType);

}
