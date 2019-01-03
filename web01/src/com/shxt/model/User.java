package com.shxt.model;

import java.util.Map;

public class User {
    private String account;
    private Map<String, Object> map;

    private String username;

    /**
     *
     */
    public User() {
        super();
    }

    /**
     * @param account
     * @param map
     * @param username
     */
    public User(String account, Map<String, Object> map, String username) {
        super();
        this.account = account;
        this.map = map;
        this.username = username;
    }

    /**
     * @param account
     * @param username
     */
    public User(String account, String username) {
        super();
        this.account = account;
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public String getUsername() {
        return username;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
