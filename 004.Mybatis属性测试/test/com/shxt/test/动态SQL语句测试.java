package com.shxt.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.shxt.dao.UserDao;
import com.shxt.model.User;
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
    public void test01() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = sqlSession.getMapper(UserDao.class).load(12);
            logger.info("user--->" + user);
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

}
