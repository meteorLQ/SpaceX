package com.lq.spacex.controller;

import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.utils.DictUtils;
import com.lq.spacex.domain.entity.SysDictData;
import com.lq.spacex.service.ISysDictDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 字典数据表 前端控制器
 * </p>
 *
 * @author LQ
 * @since 2024-07-29
 */
@RestController
@RequestMapping("/system/sysDictData")
@Slf4j
public class XDictDataController extends BaseController {
    @Autowired
    private ISysDictDataService sysDictDataService;
    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(SysDictData sysDictData) {
        startPage();
        PageInfo<SysDictData> pageInfo = sysDictDataService.list(sysDictData);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    @PostMapping("/saveOrUpdate")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated SysDictData sysDictData) {
        if (sysDictDataService.saveOrUpdate(sysDictData)) {
            List<SysDictData> dictDatas = sysDictDataService.selectDictDataByType(sysDictData.getDictType());
            DictUtils.setDictCache(sysDictData.getDictType(), dictDatas);
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    @GetMapping("/get/{id}")
    @TaskTime
    public ResponseEntity get(@PathVariable("id") String id) {
        return ResponseEntity.success(sysDictDataService.getById(id));
    }

    /**
     * 根据字典类型查询字典数据信息
     */
    @GetMapping(value = "/type/{dictType}")
    public ResponseEntity dictType(@PathVariable String dictType)
    {
        List<SysDictData> list = sysDictDataService.selectCacheDictDataByType(dictType);
        return ResponseEntity.success(list);

    }
}
