package com.lq.spacex.service.impl;




import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lq.spacex.domain.entity.SysDict;
import com.lq.spacex.mapper.SysDictMapper;
import com.lq.spacex.service.ISysDictService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-02-28
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements ISysDictService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());



    @Override
    public List<SysDict> list(SysDict sysDict) {
        LambdaQueryChainWrapper<SysDict> lambdaQuery = this.lambdaQuery();
        lambdaQuery.eq(StringUtils.isNotBlank(sysDict.getDictTypeCd()), SysDict::getDictTypeCd, sysDict.getDictTypeCd());
        lambdaQuery.like(StringUtils.isNotBlank(sysDict.getDictCd()), SysDict::getDictCd, sysDict.getDictCd());

        return lambdaQuery.list();
    }

    @Override
    public List<SysDict> getByDictTypeCd(String dictTypeCd) {
        try {
//            Boolean hasKey = redisUtils.hasKey(Constants.SYS_DICT_KEY + dictTypeCd);
//            if (hasKey) {
//                log.debug("从redis中获取字典数据，谢谢");
////                return redisUtils.getCacheObject(Constants.SYS_DICT_KEY + dictTypeCd);
////                return redisJson.getClient().jsonGet(Constants.SYS_DICT_KEY + dictTypeCd,List.class);
//            }
        } catch (Exception e) {
            log.error("redis读取字典异常:{}", ExceptionUtils.getStackTrace(e));
        }

        List<SysDict> list = this.lambdaQuery().eq(SysDict::getDictTypeCd, dictTypeCd).list();
        if (list.size() > 0) {
            try {
//                redisUtils.setCacheObject(Constants.SYS_DICT_KEY + dictTypeCd, list);
//                redisJson.getClient().jsonSetWithEscape(Constants.SYS_DICT_KEY+ dictTypeCd,list);
//                redisJson.getClient().expire(Constants.SYS_DICT_KEY+ dictTypeCd,300L);
            } catch (Exception e) {
                log.error("redis字典数据缓存失败:{}", ExceptionUtils.getStackTrace(e));
            }
            return list;
        }
        return null;
    }

    public SysDict getDictTypeCdAndDictCd(SysDict cbaySysDict) {
        SysDict sysDict = this.lambdaQuery()
                .eq(SysDict::getDictTypeCd, cbaySysDict.getDictTypeCd())
                .eq(SysDict::getDictCd, cbaySysDict.getDictCd())
                .one();
        return sysDict;
    }

}
