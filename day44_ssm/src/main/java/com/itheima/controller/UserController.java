package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
* 处理器
* */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;
    /*
    *
    * 查询所有用户
    *
    * */
    @GetMapping
    public ModelAndView findAll(String username){
//        System.out.println("查询所有用户");
        //查询所有用户
        List<User> list = userService.findAll(username);
        return new ModelAndView("user-list","userList",list);
    }

    /*
    * 添加用户
    * */
    @PostMapping
    public String addUser(User user) {
        //调用业务层添加
        userService.addUser(user);
        //重定向到user页面，相当于重新查询
        return "redirect:/user";
    }



    /**
     * 删除用户：参数从路径获取
     */
    @DeleteMapping("/{id}")
    @ResponseBody   //注：这个注解一定要加上
    public Boolean deleteUser(@PathVariable Integer id) {
        //删除的行数
        int row = userService.deleteUser(id);
        //如果大于0就返回true
        return row > 0;
    }



}
