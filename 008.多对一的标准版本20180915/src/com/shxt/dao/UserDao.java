/**
 * UserDao.java
 * 
 * @author：Helena
 *                2018-09-15
 *                com.shxt.dao.UserDao
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.dao;

import java.util.List;

import com.shxt.model.User;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月15日 上午11:16:18
 * @see com.shxt.dao.UserDao
 */

public interface UserDao {
    public List<User> listAllUser();
}
