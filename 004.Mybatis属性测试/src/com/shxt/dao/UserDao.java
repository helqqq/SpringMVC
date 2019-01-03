package com.shxt.dao;

import org.apache.ibatis.annotations.Param;

import com.shxt.model.User;

public interface UserDao {
    public int add01(User user);

    public User load(@Param("id") Integer id);
}
