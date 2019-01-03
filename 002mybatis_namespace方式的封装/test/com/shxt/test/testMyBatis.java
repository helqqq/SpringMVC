package com.shxt.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.shxt.dao.UserDao;
import com.shxt.dao.impl.UserDaoImpl;
import com.shxt.model.User;

public class testMyBatis {
    private final static Logger logger = Logger.getLogger(testMyBatis.class);

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("account", "cookie");
        map.put("password", "1");
        userDao.list(map, User.class);
        userDao.list(User.class);
    }
}
