package com.lq.spacex.controller;

import com.alibaba.fastjson2.JSON;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.Log;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.enums.BusinessType;
import com.lq.spacex.common.utils.DictUtils;
import com.lq.spacex.domain.entity.SysDictData;
import com.lq.spacex.domain.entity.SysDictType;
import com.lq.spacex.service.ISysDictDataService;
import com.lq.spacex.service.ISysDictTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@Slf4j
public class XDictTypeController extends BaseController {
    @Autowired
    private ISysDictTypeService sysDictTypeService;
    @Autowired
    private ISysDictDataService sysDictDataService;

    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(SysDictType sysDictType) {
        startPage();
        PageInfo<SysDictType> pageInfo = sysDictTypeService.list(sysDictType);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    @PostMapping("/saveOrUpdate")
    @Log(title = "字典类型",businessType = BusinessType.INSERT)
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated SysDictType sysDictType) {
        log.info("保存字典类型：{}", JSON.toJSONString(sysDictType));
        if (sysDictTypeService.saveOrUpdate(sysDictType)) {
            List<SysDictData> dictDatas = sysDictDataService.selectDictDataByType(sysDictType.getDictType());
            DictUtils.setDictCache(sysDictType.getDictType(), dictDatas);
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    @GetMapping("/get/{id}")
    @TaskTime
    public ResponseEntity get(@PathVariable("id") Long id) {
        return ResponseEntity.success(sysDictTypeService.getById(id));
    }
}
