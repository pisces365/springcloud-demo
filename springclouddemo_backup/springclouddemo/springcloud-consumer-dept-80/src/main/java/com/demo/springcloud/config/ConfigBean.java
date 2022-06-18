package com.demo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/01/29/13:46
 * @Description:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //配置负载均衡实现
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
