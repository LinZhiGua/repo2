package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
* 用户Dao
* */
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll(@Param("username") String username);

    /**
     * 添加用户
     */
    @Insert("insert into user values(null,#{username},#{birthday},#{sex},#{address},#{deptId})")
    int addUser(User user);



    /**
     * 通过id删除用户
     */
    @Delete("delete from user where id=#{id}")
    int deleteUser(Integer id);


    /*
    * 一对一查询所在部门
    *
    * */






}
