/**
 * RoleDao.java
 *
 * @author：Helena
 *                2018-09-15
 *                com.shxt.dao.RoleDao
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.dao;

import java.util.List;

import com.shxt.model.Role;
import com.shxt.model.User;

/**
 *
 * <p>
 * 描述:角色dao层
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年9月15日 上午11:16:25
 * @see com.shxt.dao.RoleDao
 */
public interface RoleDao {
    /**
     * @description 根据角色id获取相应的所有用户信息
     * @作者:Helena
     * @date 2018-10-30
     * @param role_id
     * @return
     */
    public List<User> listUserByRoleId(Integer role_id);

    /**
     * @description 根据角色id获取角色信息
     * @作者:Helena
     * @date 2018-10-30
     * @param role_id
     * @return
     */
    public Role loadRole(Integer role_id);

    /**
     * @description 根据mybatis内部获取角色及对应的所有用户
     * @作者:Helena
     * @date 2018-10-30
     * @param role_id
     * @return
     */
    public Role loadRoleAndUserByMb(Integer role_id);

    /**
     * @description 根据mybatis内部获取角色对应的所有用户
     * @作者:Helena
     * @date 2018-10-30
     * @param role_id
     * @return
     */
    public Role loadRoleByMb(Integer role_id);
}
