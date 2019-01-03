package com.shxt.user.dao;

import org.apache.ibatis.annotations.Param;

import com.shxt.user.model.User;

public interface UserDao {
    public User load(Integer id);

    public User login(@Param("account") String account, @Param("password") String password);

    public void update(User user);
}
