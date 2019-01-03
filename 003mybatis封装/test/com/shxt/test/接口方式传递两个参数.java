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
 * @see com.shxt.test.接口方式传递两个参数
 */

public class 接口方式传递两个参数 {
    private final static Logger logger = Logger.getLogger(接口方式传递两个参数.class);

    public static void main(String[] args) {

        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).query03("Helena", "2");
            sqlSession.getMapper(UserDao.class).query04("cookie", "1");
        } catch (Exception e) {
            logger.debug("获取用户信息失败，失败信息：" + e.getMessage());
            throw new RuntimeException("获取用户信息失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }

    }
}
