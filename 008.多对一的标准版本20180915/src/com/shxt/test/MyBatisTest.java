package com.shxt.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shxt.dao.RoleDao;
import com.shxt.dao.UserDao;
import com.shxt.model.Role;
import com.shxt.model.User;
import com.shxt.uitls.MyBatisUtils;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月15日 上午11:29:50
 * @see com.shxt.test.MyBatisTest
 */

public class MyBatisTest {

    private static final Logger logger = Logger.getLogger(MyBatisTest.class);

    private RoleDao roleDao = null;
    private SqlSession sqlSession = null;
    private UserDao userDao = null;

    @After
    public void af() {
        MyBatisUtils.closeSqlSession(this.sqlSession);
    }

    @Before
    public void be() {
        this.sqlSession = MyBatisUtils.getSqlSession();
        this.userDao = this.sqlSession.getMapper(UserDao.class);
        this.roleDao = this.sqlSession.getMapper(RoleDao.class);
    }

    @Test
    public void test01() {
        List<User> userList = this.userDao.listAllUser();
        for (User user : userList) {
            logger.debug("--->" + user);
        }
    }

    @Test
    public void test02() {
        Role role = this.roleDao.loadRole(2);
        List<User> userList = this.roleDao.listUserByRoleId(2);
        role.setUserList(userList);
        logger.debug("logger--->" + role);
    }

    @Test
    public void test03() {
        Role role = this.roleDao.loadRoleByMb(2);
        logger.debug("logger--->" + role);
    }

    @Test
    public void test04() {
        Role role = this.roleDao.loadRoleAndUserByMb(2);
        logger.debug("logger--->" + role);
    }

}
