package com.itheima.dao;

import com.itheima.domain.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
* 部门Dao
* */
public interface DeptDao {

    /**
     * 查询所有的部门
     */
   /* @Select("select * from dept")
    List<Dept> findAll();*/


    @Select("select * from dept")
    List<Dept> findAll();



}
