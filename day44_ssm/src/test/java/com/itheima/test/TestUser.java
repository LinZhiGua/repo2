package com.itheima.test;

import com.itheima.domain.Dept;
import com.itheima.domain.User;
import com.itheima.service.DeptService;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)  //由第三方的运行器来创建测试类，注：这个注解由JUnit提供。参数是由Spring框架写的一个运行器
@ContextConfiguration("classpath:applicationContext.xml")   //指定创建容器的配置文件或配置类
public class TestUser {

   @Autowired
   private UserService userService;

   @Autowired
   private DeptService deptService;

    @Test
    public void testUser(String username){
        List<User> list = userService.findAll(username);
        System.out.println(list);
    }

    @Test
    public void testDept(){
        List<Dept> list = deptService.findAll();
        System.out.println(list);


    }



}
