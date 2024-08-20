package com.lq.spacex.controller;

import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.domain.entity.XMenu;
import com.lq.spacex.service.IXMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/x/menu")
public class XMenuController {
    @Autowired
    private IXMenuService ixMenuService;

    @GetMapping("/list")
    public ResponseEntity list(XMenu xMenu) {
        List<XMenu> list = ixMenuService.list(xMenu);
        return ResponseEntity.success(list);
    }
}
