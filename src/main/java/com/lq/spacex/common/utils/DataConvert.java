package com.lq.spacex.common.utils;

import com.google.common.collect.Maps;


import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数据格式转换类
 *
 * @author LQ
 */
public class DataConvert {
    /**
     * 将list数据转换为Label和value映射
     *
     * @param list 转换数据
     * @param <T>
     * @return
     */
//    public static <T, R> List ListToLV(List<T> list, TypeFunction<R, String> label, TypeFunction<R, String> value) {
//        if (CollectionUtils.isEmpty(list)) {
//            return null;
//        }
//        List<HashMap<Object, Object>> maps = list.stream().map(data -> {
//            HashMap<Object, Object> map = Maps.newHashMapWithExpectedSize(2);
//            try {
//                map.put("label", BeanUtils.getProperty(data, TypeFunction.getLambdaColumnName(label)));
//                map.put("value", BeanUtils.getProperty(data, TypeFunction.getLambdaColumnName(value)));
//            } catch (Exception e) {
//
//            }
//            return map;
//        }).collect(Collectors.toList());
//        return maps;
//    }
}
