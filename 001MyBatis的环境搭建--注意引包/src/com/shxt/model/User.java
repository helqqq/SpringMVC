
package com.shxt.model;

public class User implements java.io.Serializable {
    private String account;
    private String id;
    private String password;
    private String user_name;

    /**
     *
     */
    public User() {
    }

    /**
     * @param id
     * @param user_name
     * @param account
     * @param password
     */
    public User(String id, String user_name, String account, String password) {
        super();
        this.id = id;
        this.user_name = user_name;
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User [account=" + account + ", id=" + id + ", password=" + password + ", user_name=" + user_name + "]";
    }

}
