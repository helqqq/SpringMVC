
package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shxt.model.User;

public class 获取所有的用户信息 {
    public final static String PATH = "mybatis-config.xml";

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream(PATH);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            List<User> userList = sqlSession.selectList("shxt.xy17.list_user");
            System.out.println(userList);
        } catch (IOException e) {
            e.printStackTrace();

            // throw
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
