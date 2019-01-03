package com.shxt.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sc) {
        // 起服务的时候就会初始化Application
        System.out.println("TestListener");
    }

}
