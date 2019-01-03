/**
 * MenuDao.java
 * ©2006-2016 四海兴唐科技有限公司
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2018-11-09 21:29:05
 **/
package com.shxt.menu.dao;

import java.util.List;

import com.shxt.menu.model.Menu;

public interface MenuDao {
    /**
     * sys_menu
     * 方法描述:
     *
     * @param
     * @return
     * @throws
     *         @author 胖先生
     * @date 2018-11-09 21:29:05
     *
     **/
    int add(Menu menu);

    /**
     * sys_menu
     * 方法描述:
     *
     * @param
     * @return
     * @throws
     *         @author 胖先生
     * @date 2018-11-09 21:29:05
     *
     **/
    int delete(Integer menu_id);

    /**
     * sys_menu
     * 方法描述:
     *
     * @param
     * @return
     * @throws
     *         @author 胖先生
     * @date 2018-11-09 21:29:05a
     *
     **/
    Menu load(Integer menu_id);

    List<Menu> loadMenuByRole(Integer role_id);

    /**
     * sys_menu
     * 方法描述:
     *
     * @param
     * @return
     * @throws
     *         @author 胖先生
     * @date 2018-11-09 21:29:05
     *
     **/
    int update(Menu menu);
}