package com.lq.spacex.controller;

import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.Log;
import com.lq.spacex.common.annotation.NoRepeat;
import com.lq.spacex.common.annotation.RateLimiter;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.enums.BusinessType;
import com.lq.spacex.domain.entity.SysDictType;
import com.lq.spacex.domain.entity.SysUser;
import com.lq.spacex.service.ISysDictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 字典类型表 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@RestController
@RequestMapping("/system/sysDictType")
public class SysDictTypeController extends BaseController {
    @Autowired
    private ISysDictTypeService sysDictTypeService;

    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(SysDictType sysDictType) {
        startPage();
        PageInfo<SysDictType> pageInfo = sysDictTypeService.list(sysDictType);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    @PostMapping("/saveOrUpdate")
    @Log(title = "字典管理",businessType = BusinessType.INSERT)
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated SysDictType sysUser) {
        if (sysDictTypeService.saveOrUpdate(sysUser)) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }
}
