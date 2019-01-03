package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest {
    /** 1.定义文件名 */
    private final static String PATH = "mybatis-config.xml";

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        /** 2.读取核心配置文件 */
        try {
            InputStream inputStream = Resources.getResourceAsStream(PATH);
            /** 3.创建SqlSessionFactory工厂 相当于创建Connection */
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            /** 4.创建SqlSession 相当于创建sql语句执行对象 Statement */
            sqlSession = sqlSessionFactory.openSession();
            /** 5.执行sqlSession语句，参数：namespace+"."+id */
            List<Map<String, Object>> list = sqlSession.selectList("shxt.xy17.list");
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
            // 处理
            throw new RuntimeException("连接数据库失败:" + e.getMessage());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
