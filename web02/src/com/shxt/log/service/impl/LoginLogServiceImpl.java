/**
 * LoginLogServiceImpl.java
 *
 * @author：Helena
 *                2018-09-08
 *                com.shxt.log.service.impl.LoginLogServiceImpl
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.log.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.shxt.base.utils.MyBatisUtils;
import com.shxt.log.dao.LoginLogDao;
import com.shxt.log.model.LoginLog;
import com.shxt.log.service.LoginLogService;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 上午11:48:33
 * @see com.shxt.log.service.impl.LoginLogServiceImpl
 */

public class LoginLogServiceImpl implements LoginLogService {
    private final static Logger logger = Logger.getLogger(LoginLogServiceImpl.class);

    @Override
    public void add(LoginLog loginLog) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.getMapper(LoginLogDao.class).add(loginLog);
            sqlSession.commit();
        } catch (Exception e) {
            logger.debug(this.getClass().getName() + ".add ,错误信息：" + e.getMessage());
            throw new RuntimeException(this.getClass().getName() + ".add ,错误信息：" + e.getMessage());
        } finally {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

}
