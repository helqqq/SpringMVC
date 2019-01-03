package com.shxt.log.dao;

import com.shxt.log.model.LoginLog;

/**
 * @description 登录日志DAO层
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 上午11:30:33
 * @see com.shxt.log.dao.LoginLogDao
 */

public interface LoginLogDao {
    public void add(LoginLog loginLog);
}
