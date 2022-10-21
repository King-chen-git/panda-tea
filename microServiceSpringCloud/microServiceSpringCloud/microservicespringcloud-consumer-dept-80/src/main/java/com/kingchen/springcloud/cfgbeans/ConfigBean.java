package com.kingchen.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  //这个注解替代了applicationContext.xml文件，不需要在里面对类进行注入操作。类似spring里面的applicationContext.xml写入的注入Bean
public class ConfigBean { //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate(){
       return new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
        return new RoundRobinRule();//轮询
//        return new RandomRule();//随机
//        return new RetryRule();//默认轮询，当有微服务down机后，获取到故障的微服务列表后将不会再请求down机的微服务
    }
}
