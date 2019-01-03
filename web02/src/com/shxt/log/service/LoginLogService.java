/**
 * LoginLogService.java
 *
 * @author：Helena
 *                2018-09-08
 *                com.shxt.log.service.LoginLogService
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.log.service;

import com.shxt.log.model.LoginLog;

/**
 * @description 登录日志服务
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 上午11:47:25
 * @see com.shxt.log.service.LoginLogService
 */

public interface LoginLogService {
    public void add(LoginLog loginLog);
}
