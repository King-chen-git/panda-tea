package com.kingchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringCloudApiApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudApiApplication.class, args);
    }
}
