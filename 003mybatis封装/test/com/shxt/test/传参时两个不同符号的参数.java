/**
 * 传参时两个不同符号的参数.java
 *
 * @author：Helena
 *                2018-07-01
 *                com.shxt.test.传参时两个不同符号的参数
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.shxt.dao.UserDao;
import com.shxt.utils.MyBatisUtils;

/**
 *
 * @author Helena
 * @since 1.0
 * @date 2018年7月1日 下午4:17:13
 * @see com.shxt.test.传参时两个不同符号的参数
 */

public class 传参时两个不同符号的参数 {

    public static void main(String[] args) {
        // # 推荐使用，使用的预处理模式，进行处理
        // $ 尽量使用，是拼接字符串的形式，一般为order by这样的
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("account", "Helena");
            map.put("id", "2");
            sqlSession.getMapper(UserDao.class).query05(map);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("获取信息失败：失败信息" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

}
