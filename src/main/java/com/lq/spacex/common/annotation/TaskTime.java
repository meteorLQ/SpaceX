package com.lq.spacex.common.annotation;


import java.lang.annotation.*;

/**
 * 自定义操作日志记录注解
 * 
 * @author LQ
 *
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TaskTime
{
    /**
     * 模块 
     */
    public String title() default "";
}
