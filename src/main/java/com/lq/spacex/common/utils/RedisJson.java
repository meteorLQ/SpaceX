//package com.lq.spacex.common.utils;
//
//import org.springframework.stereotype.Component;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.Protocol;
//import redis.clients.jedis.UnifiedJedis;
//import redis.clients.jedis.providers.PooledConnectionProvider;
//
///**
// * redisJson redis6.0新功能 强大的哼
// *
// * @author admin
// */
//@Component
//public class RedisJson {
//
//    HostAndPort config = new HostAndPort(Protocol.DEFAULT_HOST, 6379);
//    PooledConnectionProvider provider = new PooledConnectionProvider(config);
//
//    private static UnifiedJedis client;
//
//    private RedisJson() {
//        client = new UnifiedJedis(provider);
//    }
//
//    public  UnifiedJedis getClient() {
//        if (null == client) {
//            new RedisJson();
//        }
//        return client;
//    }
//}
