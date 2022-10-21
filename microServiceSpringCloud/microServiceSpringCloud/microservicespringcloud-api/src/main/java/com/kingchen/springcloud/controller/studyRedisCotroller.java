package com.kingchen.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Transaction;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(path = "/springcloud/redis")
public class studyRedisCotroller {

    @Autowired
    private RedisTemplate redisTemplate;//支持redis五大类型中的所有类型
    @Autowired
    private StringRedisTemplate stringRedisTemplate;//redis中的String类型


    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/3/21 10:37
     *  @Description:存取redis的所有类型数据
     */
    @RequestMapping("/setRedisAllType.do")
    public Object  setRedisAllType(){
        redisTemplate.multi();
        redisTemplate.exec();
        redisTemplate.boundValueOps("s").set("辣椒");//存入
        return redisTemplate.boundValueOps("s").get();//读取
    }


    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/4/6 23:30
     *  @Description:存取redis的String类型数据 且设置有效时间
     */
    @RequestMapping("/setRedisString.do")
    public Object  setRedisString(){
        stringRedisTemplate.boundValueOps("xlc").set("晚安");//存入
        stringRedisTemplate.opsForValue().set("demo02","我是demo02",1, TimeUnit.MINUTES);
        return stringRedisTemplate.boundValueOps("xlc").get();//读取
    }

}
