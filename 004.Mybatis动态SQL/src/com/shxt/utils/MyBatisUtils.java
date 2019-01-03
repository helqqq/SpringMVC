/**
 * MyBatisUtils.java
 *
 * @author：Helena
 *                2018-07-01
 *                com.shxt.utils.MyBatisUtils
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 *
 * @author Helena
 * @since 1.0
 * @date 2018年7月1日 下午4:39:01
 * @see com.shxt.utils.MyBatisUtils
 */

public class MyBatisUtils {
    private static SqlSessionFactory factory = null;
    public static InputStream inputStream = null;
    public final static Logger logger = Logger.getLogger(MyBatisUtils.class);
    public final static String PATH = "config/mybatis-config.xml";
    static {
        try {
            inputStream = new BufferedInputStream(Resources.getResourceAsStream(PATH));
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("获取sqlSession失败，失败原因:" + e.getMessage());
        }
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    public static SqlSession getSqlSession() {
        return factory.openSession();
    }

    private MyBatisUtils() {
    }

}
