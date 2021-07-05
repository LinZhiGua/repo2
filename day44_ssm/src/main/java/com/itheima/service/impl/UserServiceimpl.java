package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询所有用户
     * @return
     */

    @Override
    public List<User> findAll(String username) {
        return userDao.findAll(username);
    }

    /**
     * 添加用户
     */
    @Override
    public int addUser(User user) {
        System.out.println("添加成功");
        return userDao.addUser(user);
    }



    /**
     * 通过id删除用户
     */
    @Override
    public int deleteUser(Integer id) {
        System.out.println("删除成功");
        return userDao.deleteUser(id);
    }

}
