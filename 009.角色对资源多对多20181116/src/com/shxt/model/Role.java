/**
 * Role.java
 *
 * @author：Helena
 *                2018-11-06
 *                com.shxt.model.Role
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年11月6日 下午8:03:56
 * @see com.shxt.model.Role
 */

public class Role implements Serializable {
    /***/
    private static final long serialVersionUID = 1L;
    private List menuList;
    private Integer role_id;
    private String role_name;

    public List getMenuList() {
        return this.menuList;
    }

    public Integer getRole_id() {
        return this.role_id;
    }

    public String getRole_name() {
        return this.role_name;
    }

    public void setMenuList(List menuList) {
        this.menuList = menuList;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

}
