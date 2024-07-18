package com.lq.spacex.controller;


import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.domain.entity.SysUser;
import com.lq.spacex.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    @Autowired
    private ISysUserService userService;

    /**
     * 获取用户列表
     */
    @GetMapping("/list")
    public ResponseEntity list(SysUser sysUser) {
        startPage();
        PageInfo<SysUser> pageInfo = userService.selectUserList(sysUser);
        return ResponseEntity.success(getDataTable(pageInfo));

    }

    @GetMapping("/get/{id}")
    public ResponseEntity get(@PathVariable String id) {
        SysUser sysUser = userService.getByUid(id);
        return ResponseEntity.success(sysUser);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody SysUser  u) {
        userService.save(u);
        return ResponseEntity.success("成功");
    }


}
