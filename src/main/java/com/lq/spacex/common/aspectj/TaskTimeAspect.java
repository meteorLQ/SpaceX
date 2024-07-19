package com.lq.spacex.common.aspectj;


import com.lq.spacex.common.annotation.TaskTime;
import com.lq.spacex.common.utils.ServletUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author LQ
 */
@Aspect
@Component
public class TaskTimeAspect {
    private static final Logger log = LoggerFactory.getLogger(TaskTimeAspect.class);

    private ThreadLocal<StopWatch> stopWatch = ThreadLocal.withInitial(StopWatch::new);

    @Before("@annotation(controllerTaskTime)")
    public void doBefore(JoinPoint joinPoint, TaskTime controllerTaskTime) throws Throwable {
//        startTime.set(System.currentTimeMillis());
        //stopWatch.set(new StopWatch());
        StopWatch watch = stopWatch.get();
        if (!watch.isRunning()) {
            watch.start();
        }
        //接收到请求，记录请求内容
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
        //记录请求的内容
//        log.info("请求URL:" + request.getRequestURL().toString());
//        log.info("请求METHOD:" + request.getMethod());
        log.info("请求URL:{}", ServletUtils.getRequest().getRequestURI());
        log.info("请求METHOD:{}", ServletUtils.getRequest().getMethod());
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.info("请求CLASSNAME:{}", className);
        log.info("请求METHODNAME:{}", methodName);
    }


    /**
     * 处理完请求后执行
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "@annotation(controllerTaskTime)", returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, TaskTime controllerTaskTime, Object jsonResult) {
//        handleLog(joinPoint, controllerLog, null, jsonResult);
        try {
            stopWatch.get().stop();

            StringBuilder message = new StringBuilder();
            message.append(stopWatch.get().getTotalTimeMillis() / 1000.0);
//        message.append("getTotalTimeMillis"+stopWatch.getTotalTimeMillis() / 1000.0);
            message.append(" seconds");

            log.info("方法执行耗时:{}", message);
        } catch (Exception e) {
            log.error("方法执行耗时打印异常:{}", ExceptionUtils.getStackTrace(e));
        } finally {
            stopWatch.remove();
        }

    }

}
