/**
 * User.java
 *
 * @author：Helena
 *                2018-09-08
 *                com.shxt.model.User
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;

/**
 * @description
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 下午2:00:09
 * @see com.shxt.model.User
 */

public class User implements Serializable {

    /***/
    private static final long serialVersionUID = 1L;

    private String account;

    private Integer fk_role_id;

    private Role fkRole;

    private Date loginDate;

    private String pwd;

    private Map<String, Object> roleMap;

    private Integer user_id;

    private String userName;

    public String getAccount() {
        return this.account;
    }

    public Integer getFk_role_id() {
        return this.fk_role_id;
    }

    public Role getFkRole() {
        return this.fkRole;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }

    public String getPwd() {
        return this.pwd;
    }

    public Map<String, Object> getRoleMap() {
        return this.roleMap;
    }

    public Integer getUser_id() {
        return this.user_id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setFk_role_id(Integer fk_role_id) {
        this.fk_role_id = fk_role_id;
    }

    public void setFkRole(Role fkRole) {
        this.fkRole = fkRole;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setRoleMap(Map<String, Object> roleMap) {
        this.roleMap = roleMap;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*
     * (方法重写)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [account=" + account + ", fk_role_id=" + fk_role_id + ", fkRole=" + fkRole + ", loginDate="
                + loginDate + ", pwd=" + pwd + ", roleMap=" + roleMap + ", user_id=" + user_id + ", userName="
                + userName + "]";
    }

}
