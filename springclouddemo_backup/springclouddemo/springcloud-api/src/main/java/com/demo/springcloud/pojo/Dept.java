package com.demo.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/01/28/16:53
 * @Description:
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
   private Long deptno;
   private String dname;

   private String db_source;

   public Dept(String dname) {
       this.dname = dname;
   }



}
