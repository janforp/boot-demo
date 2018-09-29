package com.boot.demo.caffeinecache.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Janita on 2017/7/11- 16:29
 * 该类是:缓存数据
 */
@Configuration
@EnableCaching
public class CacheConfig {

    public static final int DEFAULT_MAX_SIZE = 50000 ;
    public static final int DEFAULT_TTL = 10 ;

    public enum Caches {

        /*** 查询*/
        getPersonById(20),

        /*** 其他的*/
        getSomething,

        /*** 其他的*/
        getOtherThing(300, 1000);
        Caches() {}
        Caches(int ttl) {
            this.ttl = ttl;
        }
        Caches(int ttl, int maxSize) {
            this.ttl = ttl;
            this.maxSize = maxSize;
        }
        /**最大數量*/
        private int maxSize = DEFAULT_MAX_SIZE;
        /**过期时间（秒）*/
        private int ttl = DEFAULT_TTL;
        public int getMaxSize() {
            return maxSize;
        }
        public int getTtl() {
            return ttl;
        }
    }

    /**
     * 创建基于Caffeine的Cache Manager
     * @return
     */
    @Bean
    @Primary
    public CacheManager caffeineCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();

        ArrayList<CaffeineCache> caches = new ArrayList<CaffeineCache>();
        for (Caches c : Caches.values()) {
            caches.add(new CaffeineCache(c.name(),
                    Caffeine.newBuilder().recordStats()
                            .expireAfterWrite(c.getTtl(), TimeUnit.SECONDS)
                            .maximumSize(c.getMaxSize())
                            .build())
            );
        }
        cacheManager.setCaches(caches);
        return cacheManager;
    }
}
