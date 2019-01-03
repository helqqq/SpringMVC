package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class 获取一条记录 {
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
            Map<String, Object> map = sqlSession.selectOne("shxt.xy17.load", 1);
            Map<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("id", 1);
            paramMap.put("account", "cookie");
            Map<String, Object> map2 = sqlSession.selectOne("shxt.xy17.load_map", paramMap);
            System.out.println(map2);
            int count = sqlSession.selectOne("shxt.xy17.count");
            System.out.println("count:" + count);
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
