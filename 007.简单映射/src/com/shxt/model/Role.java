/**
 * Role.java
 * 
 * @author：Helena
 *                2018-09-12
 *                com.shxt.model.Role
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月12日 下午8:43:54
 * @see com.shxt.model.Role
 */

public class Role implements Serializable {

    /***/
    private static final long serialVersionUID = 5961167012472668342L;
    private Integer role_id;

    private String role_name;

    public Integer getRole_id() {
        return this.role_id;
    }

    public String getRole_name() {
        return this.role_name;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    /*
     * (方法重写)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Role [role_id=" + role_id + ", role_name=" + role_name + "]";
    }

}
