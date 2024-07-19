package com.lq.spacex.controller;



import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.Log;
import com.lq.spacex.common.annotation.NoRepeat;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.enums.BusinessType;
import com.lq.spacex.domain.entity.SysUser;
import com.lq.spacex.service.ISysUserService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 用户管理前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {

    @Resource
    ISysUserService iSysUserService;

    /**
     * 用户管理列表
     *
     * @param sysUser
     * @return
     */
    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(SysUser sysUser) {
        startPage();
        PageInfo<SysUser> pageInfo = iSysUserService.list(sysUser);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    /**
     * 添加用户
     *
     * @param sysUser 用户
     */
    @PostMapping("/saveOrUpdate")
    @Log(title = "用户管理",businessType = BusinessType.INSERT)
//    @NoRepeat(lockTime = 30,lockKey = "#sysUser.loginNm")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated SysUser sysUser) {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean save = iSysUserService.saveOrUpdate(sysUser);
        if (save) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 通过userId获取用户信息
     *
     * @param userId
     * @return
     */
    @GetMapping("/getByUserId/{userId}")
    @TaskTime
    public ResponseEntity getByUserId(@PathVariable("userId") String userId) {
        logger.info("通过userId获取用户信息:{}",userId);
        return ResponseEntity.success(iSysUserService.getByUserId(userId));
    }

    /**
     * 用户启用禁用
     *
     * @param sysUser
     * @return
     */
    @PostMapping("/updateStatus")
    public ResponseEntity updateStatus(@RequestBody SysUser sysUser) {
        boolean update = iSysUserService.updateById(sysUser);
        if (update) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @DeleteMapping("/delete/{userId}")
    public ResponseEntity delete(@PathVariable String userId) {
        boolean update = iSysUserService.removeById(userId);
        if (update) {
            return ResponseEntity.success("删除成功");
        }
        return ResponseEntity.error("删除失败");
    }

    @GetMapping("/getUsers")
    @TaskTime
    public ResponseEntity getUsers() {
//        List<SysUser> sysUsers = iSysUserService.lambdaQuery().eq(SysUser::getValidInd, StatusCode.VALID_IND_YES.getCode()).list();
//        List list = DataConvert.ListToLV(sysUsers, SysUser::getUserNm, CbaySysUser::getUserId);
//        return ResponseEntity.success(list);

        return null;
    }

}

