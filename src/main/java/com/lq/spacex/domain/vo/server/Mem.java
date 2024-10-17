package com.lq.spacex.domain.vo.server;


import com.lq.spacex.common.utils.Arith;

import java.math.BigDecimal;

/**
 * 內存相关信息
 * 
 * @author LQ
 */
public class Mem
{
    /**
     * 内存总量
     */
    private BigDecimal total;

    /**
     * 已用内存
     */
    private BigDecimal used;

    /**
     * 剩余内存
     */
    private BigDecimal free;

    public BigDecimal getTotal()
    {
        return Arith.div(total, Arith.mul(new BigDecimal(1024),new BigDecimal(1024)).multiply(new BigDecimal(1024)), 2);
    }

    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getUsed()
    {
        return Arith.div(used, Arith.mul(new BigDecimal(1024),new BigDecimal(1024)).multiply(new BigDecimal(1024)), 2);
    }

    public void setUsed(BigDecimal used)
    {
        this.used = used;
    }

    public BigDecimal getFree()
    {
        return Arith.div(free, Arith.mul(new BigDecimal(1024),new BigDecimal(1024)).multiply(new BigDecimal(1024)), 2);
    }

    public void setFree(BigDecimal free)
    {
        this.free = free;
    }

    public BigDecimal getUsage()
    {
        return Arith.mul(Arith.div(used, total, 4), new BigDecimal(100));
    }
}
