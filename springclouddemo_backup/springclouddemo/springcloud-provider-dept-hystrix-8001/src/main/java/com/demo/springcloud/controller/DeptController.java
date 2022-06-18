package com.demo.springcloud.controller;

import com.demo.springcloud.pojo.Dept;
import com.demo.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/01/28/23:31
 * @Description:
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);

        if(dept == null) {
            throw new RuntimeException("id=>"+id+",throw不存在该用户，信息无法找到");
        }

        return dept;
    }

    //备选方案
    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id)
                .setDname("id=>"+id+",不存在该用户，信息无法找到")
                .setDb_source("no database");
    }
}
