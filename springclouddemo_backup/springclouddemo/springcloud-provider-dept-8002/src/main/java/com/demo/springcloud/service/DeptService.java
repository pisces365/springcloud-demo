package com.demo.springcloud.service;

import com.demo.springcloud.pojo.Dept;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/01/28/23:26
 * @Description:
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
