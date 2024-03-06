package com.lq.spacex.common.utils;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


/**
 * 数据字典转换
 */
@Component
public class DictConvert {
//    @Resource
//    ICbaySysDictService iCbaySysDictService;


    /**
     * 根据字典值获取字典描述
     * @param dictId
     * @return
     */
    public String DictValueToLabel(String dictId) {
//        CbaySysDict cbaySysDict = iCbaySysDictService.getById(dictId);
//        if (null != cbaySysDict) {
//            return cbaySysDict.getDictCnDesc();
//        }
        return null;
    }
}
