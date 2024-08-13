package com.lq.spacex.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.domain.entity.XRole;

import java.util.List;

public interface IXRoleService extends IService<XRole> {


    public List<XRole> selectRoleList(XRole role);
    /**
     * 根据条件分页查询角色数据
     *
     * @param xRole 角色信息
     * @return 角色数据集合信息
     */
    PageInfo<XRole> list(XRole xRole);

}
