package com.itheima.service.impl;

import com.itheima.dao.DeptDao;
import com.itheima.domain.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceimpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    /*
    * 查询部门信息
    * */
    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
