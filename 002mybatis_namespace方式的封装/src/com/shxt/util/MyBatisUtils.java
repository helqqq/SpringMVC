package com.shxt.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 *
 * <p>
 * 封装加载核心配置文件的工具类
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年6月3日 下午12:36:42
 * @see 新建
 * @see com.shxt.util.MyBatisUtils
 */

public final class MyBatisUtils {
    private static SqlSessionFactory factory = null;
    private static InputStream inputStream = null;
    private static Logger logger = Logger.getLogger(MyBatisUtils.class);
    private final static String PATH = "mybatis-config.xml";
    // 静态的代码块
    static {
        try {
            inputStream = Resources.getResourceAsStream(PATH);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            logger.debug("加载配置文件出错，具体错误信息：" + e.getMessage());
            throw new RuntimeException("加载配置文件出错，具体错误信息：" + e.getMessage());
        }
    }

    // 关闭sqlSession对象
    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    // 获取sqlSession对象
    public static SqlSession getSqlSession() {
        return factory.openSession();
    }

    // 不能进行实例化操作
    private MyBatisUtils() {
    }
}
