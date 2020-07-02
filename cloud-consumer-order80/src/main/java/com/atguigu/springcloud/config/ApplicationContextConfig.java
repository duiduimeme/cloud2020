package com.atguigu.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//负载均衡功能的开启
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//相当于applicationContext.xml  <bean id="" class = "">