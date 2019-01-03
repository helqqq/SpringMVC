/**
 * User.java
 *
 * @author：何丽谦
 *             2016年6月4日
 *             com.shxt.model.User
 *             Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>
 * 描述:User 实体类
 * </p>
 *
 * @author 何丽谦
 * @since 1.0
 * @date 2016年6月4日 上午9:00:37
 * @see 新建|修改|放弃
 * @see com.shxt.model.User
 */

public class User implements Serializable {

    /** 序列化 */
    private static final long serialVersionUID = 1L;
    private String account;
    private Date createDate;
    private Integer id;
    private String password;
    private Date updateDate;
    private String user_name;

    /**
     *
     */
    public User() {
    }

    /**
     * @param account
     * @param id
     * @param password
     * @param user_name
     */
    public User(String account, Integer id, String password, String user_name) {
        this.account = account;
        this.id = id;
        this.password = password;
        this.user_name = user_name;
    }

    public String getAccount() {
        return this.account;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Integer getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User [account=" + account + ", createDate=" + createDate + ", id=" + id + ", password=" + password
                + ", updateDate=" + updateDate + ", user_name=" + user_name + "]";
    }

}
