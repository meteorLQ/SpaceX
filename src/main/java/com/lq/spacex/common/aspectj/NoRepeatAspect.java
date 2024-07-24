package com.lq.spacex.common.aspectj;



import com.lq.spacex.common.annotation.NoRepeat;
import com.lq.spacex.common.exception.ServiceException;
import com.lq.spacex.common.utils.RedissonLockClient;
import jakarta.annotation.Resource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.StandardReflectionParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class NoRepeatAspect extends BaseAspect{
    @Resource
    private RedissonLockClient redissonLockClient;



    /**
     * AOP分布式锁拦截
     *
     * @param joinPoint
     * @return
     * @throws Exception
     */
    @Around("@annotation(noRepeat)")
    public Object repeatSubmit(ProceedingJoinPoint joinPoint, NoRepeat noRepeat) throws Throwable {
        String[] parameterNames = new StandardReflectionParameterNameDiscoverer().getParameterNames(((MethodSignature) joinPoint.getSignature()).getMethod());
//        String[] parameterNames = new LocalVariableTableParameterNameDiscoverer().getParameterNames(((MethodSignature) joinPoint.getSignature()).getMethod());
        if (Objects.nonNull(noRepeat)) {
            // 获取参数
            Object[] args = joinPoint.getArgs();
            // 进行一些参数的处理，比如获取订单号，操作人id等
            StringBuffer lockKeyBuffer = new StringBuffer();
            String key =getValueBySpEL(noRepeat.lockKey(), parameterNames, args,"RepeatSubmit").get(0);
            // 公平加锁，lockTime后锁自动释放
            boolean isLocked = false;
            try {
                isLocked = redissonLockClient.fairLock(key, TimeUnit.SECONDS, noRepeat.lockTime());
                // 如果成功获取到锁就继续执行
                if (isLocked) {
                    // 执行进程
                    return joinPoint.proceed();
                } else {
                    // 未获取到锁
                    throw new ServiceException("请勿重复提交");
                }
            } finally {

                // 如果锁还存在，在方法执行完成后，释放锁
                if (isLocked) {
//                    redissonLockClient.unlock(key);
                }
            }
        }

        return joinPoint.proceed();
    }
}
