package com.shxt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shxt.model.User;

public interface UserDao {
    public int add01(User user);

    public List<User> foreach01(Integer[] ints);

    public int foreachinsert(List<User> list);

    public Integer insertMore(List<User> userList);

    public List<User> listlt(Integer id);

    public List<User> moreLike01(@Param("user_name") String user_name, @Param("account") String account);

    public List<User> morelike02(@Param("user_name") String user_name, @Param("account") String account);

    public List<User> moreLike03(@Param("user_name") String user_name, @Param("account") String account);

    public List<User> moreLike04(@Param("user_name") String user_name, @Param("account") String account);

    public int update01(User user);

    public List<User> wherelike01(@Param("user_name") String user_name);

    public List<User> wherelike02(String user_name);

    public List<User> wherelike03(String user_name);
}
