package com.shxt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.shxt.dao.UserDao;
import com.shxt.model.User;
import com.shxt.utils.MyBatisUtils;

public class 动态SQL语句多个参数 {
    public final static Logger logger = Logger.getLogger(动态SQL语句多个参数.class);

    @Test
    public void 插入数据() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = new User();
            user.setAccount("Rechal");
            user.setUser_name("瑞秋");
            user.setPassword("3");
            user.setCreateDate(new Date());
            user.setUpdateDate(new Date());
            sqlSession.getMapper(UserDao.class).add01(user);
            sqlSession.commit();
            logger.info("---->" + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void 迭代用法foreach01() {
        SqlSession sqlSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("config/mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = factory.openSession();
            Integer[] ints = new Integer[]{ 1 , 4 , 8 , 9 , 10 };
            sqlSession.getMapper(UserDao.class).foreach01(ints);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Test
    public void 迭代用法foreach02() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = new User();
            user.setAccount("monika");
            user.setUser_name("莫妮卡");
            user.setPassword("3");
            List list = new ArrayList();
            list.add(user);
            sqlSession.getMapper(UserDao.class).foreachinsert(list);
            sqlSession.commit();
            logger.info("---->" + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void 更新语句set() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            User user = new User();
            user.setAccount("candy");
            user.setUser_name("糖果");
            user.setPassword("2");
            user.setId(8);
            sqlSession.getMapper(UserDao.class).update01(user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void 批量更新foreach03() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            List<User> userList = new ArrayList<User>();
            User user = new User();
            user.setAccount("Chandler");
            user.setUser_name("钱德勒");
            user.setPassword("1");
            user.setCreateDate(new Date());
            userList.add(user);
            user = new User();
            user.setAccount("Joyi");
            user.setUser_name("乔伊");
            user.setPassword("2");
            user.setCreateDate(new Date());
            userList.add(user);
            user = new User();
            user.setAccount("Ross");
            user.setUser_name("罗斯");
            user.setPassword("3");
            user.setCreateDate(new Date());
            userList.add(user);
            Integer count = sqlSession.getMapper(UserDao.class).insertMore(userList);
            logger.info("count:" + count);
            for (User u : userList) {
                logger.info("---->" + u.getId());
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void WHERE和IF语句判断多条件组合01() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).moreLike01("王", "wangxh");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void WHERE和IF语句判断多条件组合02() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).morelike02("王", "wangxh");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void WHERE和IF语句判断多条件组合03() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(UserDao.class).listlt(6);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

}
