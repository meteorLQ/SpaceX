package com.lq.spacex.controller;



import com.lq.spacex.common.core.controller.BaseController;
import com.lq.spacex.common.core.domain.ResponseEntity;
import com.lq.spacex.domain.entity.SysDict;
import com.lq.spacex.service.ISysDictService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 字典数据前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@RestController
@RequestMapping("/system/sysDict")
public class SysDictController extends BaseController {
    @Resource
    ISysDictService iCbaySysDictService;


    /**
     * 字典新增
     *
     * @param cbaySysDict
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Valid SysDict cbaySysDict) {
        // 重复添加判断
        // 更新
        if (StringUtils.isNotBlank(cbaySysDict.getDictId())) {
            SysDict sysDictO = iCbaySysDictService.getById(cbaySysDict.getDictId());
            if (!sysDictO.getDictCd().equals(cbaySysDict.getDictCd())) {
                SysDict sysDict = iCbaySysDictService.getDictTypeCdAndDictCd(cbaySysDict);
                Assert.isNull(sysDict, "该字典值已存在，请更换字典值重试！");
            }
            if (iCbaySysDictService.updateById(cbaySysDict)) {
                return ResponseEntity.success("修改成功");
            }
            return ResponseEntity.error("修改失败");
        }
        // 添加
        SysDict sysDict = iCbaySysDictService.getDictTypeCdAndDictCd(cbaySysDict);
        Assert.isNull(sysDict, "该字典值已存在，不可重复添加！");
        if (iCbaySysDictService.save(cbaySysDict)) {
            return ResponseEntity.success("操作成功");
        }
        return ResponseEntity.error("操作失败");
    }

    /**
     * 字典修改
     *
     * @param cbaySysDict
     * @return
     */
    @PutMapping("/edit")
    public ResponseEntity edit(@RequestBody @Valid SysDict cbaySysDict) {
        if (iCbaySysDictService.updateById(cbaySysDict)) {
            return ResponseEntity.success("修改成功");
        }
        return ResponseEntity.error("修改失败");
    }

    /**
     * 根据字典值获取字典信息
     *
     * @param dictId
     * @return
     */
    @GetMapping("/getByDictId/{dictId}")
    public ResponseEntity getByDictId(@PathVariable String dictId) {
        SysDict sysDict = iCbaySysDictService.getById(dictId);
        return ResponseEntity.success(sysDict);
    }

    /**
     * 字典数据分页条件查询
     *
     * @param cbaySysDict 查询条件
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity list(SysDict cbaySysDict) {
        startPage();
        List<SysDict> list = iCbaySysDictService.list(cbaySysDict);
        return ResponseEntity.success(getDataTable(list));
    }

    /**
     * 根据字典类型id获取字典数据
     *
     * @param dictTypeCd 字典类型id
     * @return
     */
    @GetMapping("/getByDictTypeCd/{dictTypeCd}")
    public ResponseEntity getByDictTypeCd(@PathVariable String dictTypeCd) {
        List<SysDict> list = iCbaySysDictService.getByDictTypeCd(dictTypeCd);
        return ResponseEntity.success(list);
    }

    /**
     * 字典值删除
     *
     * @param dictIds
     * @return
     */
    @DeleteMapping("/deleteByDictId/{dictIds}")
    public ResponseEntity deleteByDictId(@PathVariable String[] dictIds) {
        logger.info("dictIds:{}", dictIds.length);
//        iCbaySysDictService.removeBatchByIds(Arrays.asList(dictIds));
        return ResponseEntity.success("删除成功");
    }


}

