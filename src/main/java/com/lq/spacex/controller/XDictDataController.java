package com.lq.spacex.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.github.pagehelper.PageInfo;
import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.common.utils.DictUtils;
import com.lq.spacex.common.utils.StringUtils;
import com.lq.spacex.domain.entity.XDictData;
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
@RequestMapping("/sysDictData")
@Slf4j
public class XDictDataController extends BaseController {
    @Autowired
    private ISysDictDataService sysDictDataService;
    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(XDictData sysDictData) {
        startPage();
        PageInfo<XDictData> pageInfo = sysDictDataService.list(sysDictData);
        return ResponseEntity.success(getDataTable(pageInfo));
    }

    @PostMapping("/saveOrUpdate")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated XDictData xDictData) {

        if (StringUtils.isNotBlank(xDictData.getDictCode())){
            List<XDictData> dictData = sysDictDataService.selectDictDataByTypeAndValue(xDictData.getDictType(), xDictData.getDictValue());
            if (CollectionUtil.isNotEmpty(dictData)){
                ResponseEntity.error("字典值已存在");
            }
        }

        if (sysDictDataService.saveOrUpdate(xDictData)) {
            List<XDictData> dictDatas = sysDictDataService.selectDictDataByType(xDictData.getDictType());
            DictUtils.setDictCache(xDictData.getDictType(), dictDatas);
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
    public ResponseEntity dictType(@PathVariable String dictType) {
        List<XDictData> list = sysDictDataService.selectCacheDictDataByType(dictType);
        return ResponseEntity.success(list);

    }

    @DeleteMapping(value = "/del/{dictCode}")
    public ResponseEntity delete(@PathVariable String dictCode) {
        if (sysDictDataService.removeById(dictCode)) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");

    }
}
