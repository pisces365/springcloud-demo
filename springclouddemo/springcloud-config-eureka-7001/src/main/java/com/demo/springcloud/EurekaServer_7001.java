package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/01/29/22:57
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer服务端启动类，接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class, args);
    }
}
