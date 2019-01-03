/**
 * MyBatisUtils.java
 *
 * @author：何丽谦
 *             2016年6月4日
 *             com.shxt.utils.MyBatisUtils
 *             Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.utils;

import java.io.BufferedInputStream;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 * 描述:封装核心配置文件[不能实例化]
 *
 * @author 何丽谦
 * @since 1.0
 * @date 2016年6月4日 上午9:31:08
 * @see 新建|修改|放弃
 * @see com.shxt.utils.MyBatisUtils
 */

public final class MyBatisUtils {
    /** 1.创建流 */
    private static InputStream inputStream = null;
    private static final Logger logger = Logger.getLogger(MyBatisUtils.class);
    private final static String PATH = "mybatis-config.xml";

    /** 声明SqlSessionFactory工厂(接口) 接口回调 -->相当于创建connection */
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            inputStream = new BufferedInputStream(Resources.getResourceAsStream(PATH));
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            logger.error("数据库获取文件异常，异常信息为：" + e.getMessage());
            throw new RuntimeException("数据库获取文件异常，异常信息为：" + e.getMessage());
        }
    }

    /**
     * 描述:关闭sqlSession对象
     *
     * @作者:何丽谦
     *         2016年6月4日
     * @param sqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    /**
     * 描述:获取SqlSession对象
     * 
     * @作者:何丽谦
     *         2016年6月4日
     * @return
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * 构造函数私有化
     * 该类不能被实现
     */
    private MyBatisUtils() {
    }

}
