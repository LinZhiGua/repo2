package com.itheima.service;

import com.itheima.domain.Dept;

import java.util.List;

public interface DeptService {

    /*
    * 查询部门信息
    * */
    List<Dept> findAll();
}
