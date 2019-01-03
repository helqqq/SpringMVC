package com.shxt.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.shxt.dao.UserDao;
import com.shxt.utils.MyBatisUtils;

/**
 *
 * @author Helena
 * @since 1.0
 * @date 2018年7月1日 下午5:02:38
 * @see .动态SQL语句测试
 */

public class 动态SQL语句测试 {
    public static final Logger logger = Logger.getLogger(动态SQL语句测试.class);

    @Test
    public void WHERE语句实现$01() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            List list = sqlSession.getMapper(UserDao.class).wherelike01("王");
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void WHERE语句实现02() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).wherelike02("王%");
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void WHERE语句实现03推荐() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).wherelike03("王");
        } catch (Exception e) {
            logger.debug(e);
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }
}
