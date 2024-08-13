package com.lq.spacex.controller;

import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.Log;
import com.lq.spacex.common.annotation.NoRepeat;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.enums.BusinessType;
import com.lq.spacex.domain.entity.SysUser;
import com.lq.spacex.domain.entity.XRole;
import com.lq.spacex.service.IXRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 角色信息表 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@RestController
@RequestMapping("/x/sysRole")
public class XRoleController extends BaseController {

    @Autowired
    private IXRoleService iXRoleService;

    @GetMapping("/list")
    public ResponseEntity list(XRole xRole) {
        startPage();
        PageInfo<XRole> pageInfo = iXRoleService.list(xRole);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    @PostMapping("/saveOrUpdate")
    @Log(title = "角色管理", businessType = BusinessType.INSERT)
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated XRole xRole) {
        boolean save = iXRoleService.saveOrUpdate(xRole);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    @GetMapping("/get/{id}")
    @TaskTime
    public ResponseEntity get(@PathVariable("id") Long id) {
        return ResponseEntity.success(iXRoleService.getById(id));
    }

}
