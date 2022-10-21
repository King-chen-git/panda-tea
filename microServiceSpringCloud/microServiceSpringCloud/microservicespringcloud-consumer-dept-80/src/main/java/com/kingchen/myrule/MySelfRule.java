package com.kingchen.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myIRule(){
//        return new RandomRule();//ribbon定义为轮询，这里自定义为随机
        return new RandomRule_KC();
    }
}
