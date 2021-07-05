package com.itheima.controller;

import com.itheima.domain.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门的处理器
 * @Controller + @ResponseBody = @RestController
 * 既代表是处理器，而且类中所有的方法都返回JSON字符串
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 查询所有的部门
     */
    @RequestMapping("/findAll")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
