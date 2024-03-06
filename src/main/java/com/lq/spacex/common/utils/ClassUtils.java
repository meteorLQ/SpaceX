package com.lq.spacex.common.utils;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * 类操作工具类
 *
 * @author LQ
 */
public class ClassUtils {
    /**
     * 根据指定属性名称获取属性值
     *
     * @param fieldName 属性名称
     * @param o         操作类
     * @return
     */
    public static Object getFieldValueByName(String fieldName, Object o) {
        Field ofcNm = ReflectionUtils.findField(o.getClass(), fieldName);
        ReflectionUtils.makeAccessible(ofcNm);
        Object value = ReflectionUtils.getField(ofcNm, o);
        return value;
    }
}
