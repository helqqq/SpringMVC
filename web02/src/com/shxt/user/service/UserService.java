package com.shxt.user.service;

import com.shxt.user.model.User;

public interface UserService {
    public User load(Integer id);

    public User login(String account, String password);
}
