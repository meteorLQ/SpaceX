package com.lq.spacex.domain.vo.server;



import com.lq.spacex.common.utils.Arith;
import com.lq.spacex.common.utils.DateUtils;

import java.lang.management.ManagementFactory;
import java.math.BigDecimal;

/**
 * JVM相关信息
 * 
 * @author LQ
 */
public class Jvm
{
    /**
     * 当前JVM占用的内存总数(M)
     */
    private BigDecimal total;

    /**
     * JVM最大可用内存总数(M)
     */
    private BigDecimal max;

    /**
     * JVM空闲内存(M)
     */
    private BigDecimal free;

    /**
     * JDK版本
     */
    private String version;

    /**
     * JDK路径
     */
    private String home;

    public BigDecimal getTotal()
    {
        return Arith.div(total, Arith.mul(new BigDecimal("1024"),new BigDecimal("1024")), 2);
    }

    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getMax()
    {
        return Arith.div(max, Arith.mul(new BigDecimal(1024) ,new BigDecimal(1024)), 2);
    }

    public void setMax(BigDecimal max)
    {
        this.max = max;
    }

    public BigDecimal getFree()
    {
        return Arith.div(free, Arith.mul(new BigDecimal(1024) ,new BigDecimal(1024)), 2);
    }

    public void setFree(BigDecimal free)
    {
        this.free = free;
    }

    public BigDecimal getUsed()
    {
        return Arith.div(Arith.sub(total,free), Arith.mul(new BigDecimal(1024) ,new BigDecimal(1024)), 2);
    }

    public BigDecimal getUsage()
    {
        return Arith.mul(Arith.div(Arith.sub(total,free), total, 4), new BigDecimal("100"));
    }

    /**
     * 获取JDK名称
     */
    public String getName()
    {
        return ManagementFactory.getRuntimeMXBean().getVmName();
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public String getHome()
    {
        return home;
    }

    public void setHome(String home)
    {
        this.home = home;
    }

    /**
     * JDK启动时间
     */
    public String getStartTime()
    {
        return DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, DateUtils.getServerStartDate());
    }

    /**
     * JDK运行时间
     */
    public String getRunTime()
    {
        return DateUtils.timeDistance(DateUtils.getNowDate(), DateUtils.getServerStartDate());
    }

    /**
     * 运行参数
     */
    public String getInputArgs()
    {
        return ManagementFactory.getRuntimeMXBean().getInputArguments().toString();
    }
}
