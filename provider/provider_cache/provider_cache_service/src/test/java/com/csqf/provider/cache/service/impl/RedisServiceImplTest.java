package com.csqf.provider.cache.service.impl;

import com.csqf.provider.cache.ProviderCacheApplication;
import com.csqf.provider.cache.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderCacheApplication.class)
public class RedisServiceImplTest {

    @Autowired
    private RedisService redisService;

    @Test
    public void test(){
        redisService.set("provider:cache:money",2);
        Object  result = redisService.get("provider:cache:money");
        System.out.println(result);
    }
}
