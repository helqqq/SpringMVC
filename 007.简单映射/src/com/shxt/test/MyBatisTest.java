/**
 * MyBatisTest.java
 *
 * @author：Helena
 *                2018-09-08
 *                com.shxt.test.MyBatisTest
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shxt.dao.UserDao;
import com.shxt.model.User;
import com.shxt.utils.MyBatisUtils;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 下午2:17:05
 * @see com.shxt.test.MyBatisTest
 */

public class MyBatisTest {
    private static final Logger logger = Logger.getLogger(MyBatisTest.class);

    private SqlSession sqlSession = null;
    private UserDao userDao = null;

    @After
    public void af() {
        MyBatisUtils.closeSqlSession(sqlSession);
    }

    @Before
    public void be() {
        sqlSession = MyBatisUtils.getSqlSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Test
    public void exec() {
        try {
            List<User> userList = this.userDao.getUserListByResultMap();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
        }
    }

    @Test
    public void exec2() {
        logger.debug(this.userDao.queryUserByPk(1));
    }

    @Test
    public void exec3() {
        logger.debug(this.userDao.queryAllUser());
    }

}
