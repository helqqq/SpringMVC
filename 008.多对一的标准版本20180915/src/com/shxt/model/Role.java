/**
 * Role.java
 *
 * @author：Helena
 *                2018-09-15
 *                com.shxt.model.Role
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月15日 上午10:58:06
 * @see com.shxt.model.Role
 */

public class Role implements Serializable {

    /***/
    private static final long serialVersionUID = 5961167012472668342L;
    private Integer role_id;

    private String role_name;

    private List<User> userList;

    /**
     *
     */
    public Role() {
    }

    /**
     * @param role_id
     * @param role_name
     */
    public Role(Integer role_id, String role_name) {
        super();
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public Integer getRole_id() {
        return this.role_id;
    }

    public String getRole_name() {
        return this.role_name;
    }

    public List<User> getUserList() {
        return this.userList;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Role [role_id=" + role_id + ", role_name=" + role_name + ", userList=" + userList + "]";
    }

}
