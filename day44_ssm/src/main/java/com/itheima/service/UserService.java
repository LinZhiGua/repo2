package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {


    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll(String username);


    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 通过id删除用户
     */
    int deleteUser(Integer id);



}
