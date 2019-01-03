package com.shxt.menu.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shxt.base.utils.MyBatisUtils;
import com.shxt.menu.dao.MenuDao;
import com.shxt.menu.model.Menu;
import com.shxt.menu.service.MenuService;

public class MenuServiceImpl implements MenuService {

    @Override
    public List<Menu> loadMenuByRole(Integer role_id) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        MenuDao menuDao = sqlSession.getMapper(MenuDao.class);
        List<Menu> menuList = menuDao.loadMenuByRole(role_id);
        MyBatisUtils.closeSqlSession(sqlSession);
        return menuList;
    }

}
