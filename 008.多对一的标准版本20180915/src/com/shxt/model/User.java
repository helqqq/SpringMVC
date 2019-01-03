/**
 * User.java
 *
 * @author：Helena
 *                2018-09-15
 *                com.shxt.model.User
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月15日 上午10:57:45
 * @see com.shxt.model.User
 */

public class User implements Serializable {

    /***/
    private static final long serialVersionUID = 1L;

    private String account;

    private Integer fk_role_id;

    private Integer id;

    private Date loginDate;

    private String password;

    private Role role;

    private String user_name;

    /**
     *
     */
    public User() {
    }

    /**
     * @param account
     * @param fk_role_id
     * @param id
     * @param loginDate
     * @param password
     * @param user_name
     */
    public User(String account, Integer fk_role_id, Integer id, Date loginDate, String password, String user_name) {
        super();
        this.account = account;
        this.fk_role_id = fk_role_id;
        this.id = id;
        this.loginDate = loginDate;
        this.password = password;
        this.user_name = user_name;
    }

    public String getAccount() {
        return this.account;
    }

    public Integer getFk_role_id() {
        return this.fk_role_id;
    }

    public Integer getId() {
        return this.id;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }

    public String getPassword() {
        return this.password;
    }

    public Role getRole() {
        return this.role;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setFk_role_id(Integer fk_role_id) {
        this.fk_role_id = fk_role_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /*
     * (方法重写)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [account=" + account + ", fk_role_id=" + fk_role_id + ", id=" + id + ", loginDate=" + loginDate
                + ", password=" + password + ", role=" + role + ", user_name=" + user_name + "]";
    }

}
