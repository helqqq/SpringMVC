package com.shxt.dao;

import com.shxt.model.Role;

/**
 * @description 角色dao层
 * @author Helena
 * @since 1.0
 * @date 2018年9月12日 下午8:53:14
 * @see com.shxt.dao.RoleDao
 */

public interface RoleDao {
    public Role LoadRoleById(Integer role_id);
}
