/**
 * Menu.java
 *
 * @author：Helena
 *                2018-11-06
 *                com.shxt.model.Menu
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.model;

import java.io.Serializable;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年11月6日 下午8:04:11
 * @see com.shxt.model.Menu
 */

public class Menu implements Serializable {
    /***/
    private static final long serialVersionUID = -1328178550999202848L;
    private Integer menu_id;
    private String menu_name;
    private String url;

    public Integer getMenu_id() {
        return this.menu_id;
    }

    public String getMenu_name() {
        return this.menu_name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
