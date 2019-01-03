/**
 * MyBatisTest.java
 *
 * @author：何丽谦
 *             2016年6月4日
 *             com.shxt.test.MyBatisTest
 *             Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.shxt.dao.UserDao;
import com.shxt.utils.MyBatisUtils;

/**
 *
 * <p>
 * 描述:
 * </p>
 *
 * @author 何丽谦
 * @since 1.0
 * @date 2016年6月4日 上午9:11:00
 * @see 新建|修改|放弃
 * @see com.shxt.test.MyBatisTest
 */

public class MyBatisTest {
    private static final Logger logger = Logger.getLogger(MyBatisTest.class);

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).list();

        } catch (Exception e) {
            logger.error("数据库获取文件异常，异常信息为：" + e.getMessage());
            throw new RuntimeException("数据库获取文件异常，异常信息为：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }
}
