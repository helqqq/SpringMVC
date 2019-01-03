package com.shxt.log.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @desprication 登录日志
 * @author Helena
 * @since 1.0
 * @date 2018年9月8日 上午11:22:04
 * @see com.shxt.log.model.LoginLog
 */

public class LoginLog implements Serializable {

    /***/
    private static final long serialVersionUID = 1L;
    private String ip;
    private Date log_date;
    private String log_id;
    private Integer user_id;
    private String user_name;

    public String getIp() {
        return this.ip;
    }

    public Date getLog_date() {
        return this.log_date;
    }

    public String getLog_id() {
        return this.log_id;
    }

    public Integer getUser_id() {
        return this.user_id;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "LoginLog [ip=" + this.ip + ", log_date=" + this.log_date + ", log_id=" + this.log_id + ", user_id="
                + this.user_id + ", user_name=" + this.user_name + "]";
    }

}
