package com.lq.spacex.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lq.spacex.domain.entity.SysOperLog;

/**
 * <p>
 * 操作日志记录 服务类
 * </p>
 *
 * @author LQ
 * @since 2022-06-23
 */
public interface ISysOperLogService extends IService<SysOperLog> {
   public void saveBySysOperLog(SysOperLog sysOperLog);
}
