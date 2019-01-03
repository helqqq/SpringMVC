/**
 * BaseDaoImpl.java
 *
 * @author：Helena
 *                2018-06-25
 *                com.shxt.base.BaseDaoImpl
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.shxt.util.MyBatisUtils;

/**
 *
 * @author Helena
 * @since 1.0
 * @date 2018年6月25日 下午6:45:25
 * @see com.shxt.base.BaseDaoImpl
 */

public class BaseDaoImpl<T> {
    public static Logger logger = Logger.getLogger(BaseDaoImpl.class);

    public int add(T t) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            int num = sqlSession.insert(t.getClass().getName() + ".add", t);
            sqlSession.commit();
            return num;
        } catch (Exception e) {
            logger.error("新增对象失败，错误信息：" + e.getMessage());
            throw new RuntimeException("新增对象失败，错误信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    /**
     *
     * <p>
     * 描述:
     * </p>
     *
     * @作者:Helena
     *            2018-06-25
     * @param t
     * @return
     */
    public int delete(Integer id, Class clazz) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            int num = sqlSession.delete(clazz.getName() + ".delete", id);
            sqlSession.commit();
            return num;
        } catch (Exception e) {
            logger.debug("删除对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("删除对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    public List<T> list(Class clazz) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            return sqlSession.selectList(clazz.getName() + ".listAll");
        } catch (Exception e) {
            logger.debug("获取对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("获取对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    public List<T> list(Map<String, Object> map, Class clazz) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            return sqlSession.selectList(clazz.getName() + ".list", map);
        } catch (Exception e) {
            logger.debug("获取对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("获取对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    public T load(Integer id, Class clazz) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            return sqlSession.selectOne(clazz.getName() + ".load", id);
        } catch (Exception e) {
            logger.debug("load获取对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("load获取对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    public T query(Map<String, Object> map, Class clazz) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            return sqlSession.selectOne(clazz.getName(), map);
        } catch (Exception e) {
            logger.debug("query获取对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("query获取对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    public int update(T t) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            int num = sqlSession.update(t.getClass().getName(), t);
            sqlSession.commit();
            return num;
        } catch (Exception e) {
            logger.debug("update获取对象失败，失败信息：" + e.getMessage());
            throw new RuntimeException("update获取对象失败，失败信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }

    }
}
