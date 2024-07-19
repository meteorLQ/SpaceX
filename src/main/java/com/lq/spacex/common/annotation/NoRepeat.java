package com.lq.spacex.common.annotation;

import java.lang.annotation.*;

/**
 * 防重注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface NoRepeat {

    /**
     * 超时时间
     *
     * @return
     */
    int lockTime();


    /**
     * redis 锁key的
     *
     * @return redis 锁key
     */
    String lockKey();

}
