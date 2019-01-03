package com.shxt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shxt.model.Role;

/**
 * <p>
 * 描述:角色接口层
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年11月6日 下午8:14:33
 * @see com.shxt.dao.RoleDao
 */

public interface RoleDao {
    public void addRoleList(List roleList);

    void addRoleMneu(@Param("role") Role role, @Param("menus") List menuList);

    void addRoleMneu02(@Param("role") Role role, @Param("menus") List menuList);

    public void deleteRoleMenuLinkByRole(@Param("role") Role role);

    public List loadAllRole();

    Role loadRole(Integer role_id);
}
