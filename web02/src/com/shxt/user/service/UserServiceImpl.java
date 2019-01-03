package com.shxt.user.service;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.shxt.base.utils.MyBatisUtils;
import com.shxt.user.dao.UserDao;
import com.shxt.user.model.User;

public class UserServiceImpl implements UserService {

    @Override
    public User load(Integer id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = sqlSession.getMapper(UserDao.class).load(1);
            if (user != null) {
                return user;
            } else {
                throw new RuntimeException("用户名或密码错误，请重新输入");
            }
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Override
    public User login(String account, String password) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = sqlSession.getMapper(UserDao.class).login(account, password);
            if (user != null) {
                user.setUpdate_date(new Date());
                sqlSession.getMapper(UserDao.class).update(user);
                sqlSession.commit();
                return user;
            } else {
                throw new RuntimeException("用户名或密码错误，请重新登录");
            }
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

}
