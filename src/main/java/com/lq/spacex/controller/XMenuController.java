package com.lq.spacex.controller;

import com.lq.spacex.common.annotation.Log;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.enums.BusinessType;
import com.lq.spacex.domain.entity.XMenu;
import com.lq.spacex.service.IXMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 菜单权限表 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2024-08-19
 */
@RestController
@RequestMapping("/menu")
public class XMenuController {
    @Autowired
    private IXMenuService ixMenuService;

    @GetMapping("/list")
    public ResponseEntity list(XMenu xMenu) {
        List<XMenu> list = ixMenuService.list(xMenu);
        return ResponseEntity.success(list);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity get(@PathVariable Long id) {
        XMenu xMenu = ixMenuService.getById(id);
        return ResponseEntity.success(xMenu);
    }

    @PostMapping("/saveOrUpdate")
    @Log(title = "菜单管理", businessType = BusinessType.INSERT)
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated XMenu xRole) {
        boolean save = ixMenuService.saveOrUpdate(xRole);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }
}
