/**
 * Menu.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2018-11-09 21:29:05
 **/
package com.shxt.menu.model;

/**
 * sys_menu 类
 * @Description : 
 * 
 * @author 胖先生
 * @version 1.0 
 * 文件创建于: 2018-11-09 21:29:05
 **/
public class Menu {

    private Integer menu_id;
    private String menu_name;
    private String url;

    /**
     * 获取  字段:sys_menu.menu_id
     *
     * @return  sys_menu.menu_id
     */
    public Integer getMenu_id() {
        return menu_id;
    }

    /**
     * 设置  字段:sys_menu.menu_id
     *
     * @param menu_id  sys_menu.menu_id
     */
    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    /**
     * 获取  字段:sys_menu.menu_name
     *
     * @return  sys_menu.menu_name
     */
    public String getMenu_name() {
        return menu_name;
    }

    /**
     * 设置  字段:sys_menu.menu_name
     *
     * @param menu_name  sys_menu.menu_name
     */
    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name == null ? null : menu_name.trim();
    }

    /**
     * 获取  字段:sys_menu.url
     *
     * @return  sys_menu.url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置  字段:sys_menu.url
     *
     * @param url  sys_menu.url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}