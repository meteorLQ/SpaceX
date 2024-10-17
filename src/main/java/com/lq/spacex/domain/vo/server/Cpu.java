package com.lq.spacex.domain.vo.server;


import com.lq.spacex.common.utils.Arith;

import java.math.BigDecimal;

/**
 * CPU相关信息
 * 
 * @author LQ
 */
public class Cpu
{
    /**
     * 核心数
     */
    private int cpuNum;

    /**
     * CPU总的使用率
     */
    private BigDecimal total;

    /**
     * CPU系统使用率
     */
    private BigDecimal sys;

    /**
     * CPU用户使用率
     */
    private BigDecimal used;

    /**
     * CPU当前等待率
     */
    private BigDecimal wait;

    /**
     * CPU当前空闲率
     */
    private BigDecimal free;

    public int getCpuNum()
    {
        return cpuNum;
    }

    public void setCpuNum(int cpuNum)
    {
        this.cpuNum = cpuNum;
    }

    public BigDecimal getTotal()
    {
        return Arith.round(Arith.mul(total, new BigDecimal("100")), 2);
    }

    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getSys()
    {
        return Arith.round(Arith.mul(Arith.div(sys,total) , new BigDecimal(100)), 2);
    }

    public void setSys(BigDecimal sys)
    {
        this.sys = sys;
    }

    public BigDecimal getUsed()
    {
        return Arith.round(Arith.mul(Arith.div(used,total), new BigDecimal(100)), 2);
    }

    public void setUsed(BigDecimal used)
    {
        this.used = used;
    }

    public BigDecimal getWait()
    {
        return Arith.round(Arith.mul(Arith.div(wait,total), new BigDecimal(100) ), 2);
    }

    public void setWait(BigDecimal wait)
    {
        this.wait = wait;
    }

    public BigDecimal getFree()
    {
        return Arith.round(Arith.mul(Arith.div(free,total), new BigDecimal(100)), 2);
    }

    public void setFree(BigDecimal free)
    {
        this.free = free;
    }
}
