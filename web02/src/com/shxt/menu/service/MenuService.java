/**
 * MenuService.java
 * 
 * @author：Helena
 *                2018-11-09
 *                com.shxt.menu.service.MenuService
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.menu.service;

import java.util.List;

import com.shxt.menu.model.Menu;

/**
 * <p>
 * 描述:
 * </p>
 * 
 * @author Helena
 * @since 1.0
 * @date 2018年11月9日 下午10:02:36
 * @see com.shxt.menu.service.MenuService
 */

public interface MenuService {
    List<Menu> loadMenuByRole(Integer role_id);
}
