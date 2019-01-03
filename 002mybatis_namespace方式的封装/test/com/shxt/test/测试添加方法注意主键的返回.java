package com.shxt.test;

import org.apache.log4j.Logger;

import com.shxt.dao.UserDao;
import com.shxt.dao.impl.UserDaoImpl;
import com.shxt.model.User;

public class 测试添加方法注意主键的返回 {
    public final static Logger logger = Logger.getLogger(User.class);

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();// 接口回调
        User user = new User();
        user.setAccount("wangxh");
        user.setPassword("2");
        user.setUser_name("王小黑");
        // user.setId("8");
        User user2 = userDao.load(8, User.class);
        int num = userDao.add(user);
        logger.info("--->" + user2);
        logger.debug("---->" + user.getId());
    }
}
