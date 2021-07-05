package com.itheima.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class User {

    private Integer id;
    private String username;
    private Date birthday;
    private char sex;
    private String address;

    private Integer deptId;  //表的deptId
    private Dept dept;  //对应一个实体类
}
