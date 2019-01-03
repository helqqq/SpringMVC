/**
 * UserDao.java
 *
 * @author：Helena
 *                2018-09-08
 *                com.shxt.dao.UserDao
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.dao;

import java.util.List;
import java.util.Map;

import com.shxt.model.User;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 下午2:04:17
 * @see com.shxt.dao.UserDao
 */

public interface UserDao {
    public List<Map<String, Object>> getMapList();

    public List<User> getUserList();

    public List<User> getUserListByResultMap();

    public List<User> queryAllUser();

    public Map<String, Object> queryRoleById(Integer role_id);

    public User queryUserByPk(Integer user_id);

}
