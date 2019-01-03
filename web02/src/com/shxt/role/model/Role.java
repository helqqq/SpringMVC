/**
 * Role.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2018-11-09 21:28:20
 **/
package com.shxt.role.model;

/**
 * sys_role 类
 * @Description : 
 * 
 * @author 胖先生
 * @version 1.0 
 * 文件创建于: 2018-11-09 21:28:20
 **/
public class Role {

    /**用户角色表主键,所属表字段为 sys_role.role_id  */
    private Integer role_id;
    private String role_name;

    /**
     * 获取 用户角色表主键 字段:sys_role.role_id
     *
     * @return  sys_role.role_id  ,用户角色表主键
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * 设置 用户角色表主键 字段:sys_role.role_id
     *
     * @param role_id  sys_role.role_id,用户角色表主键
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     * 获取  字段:sys_role.role_name
     *
     * @return  sys_role.role_name
     */
    public String getRole_name() {
        return role_name;
    }

    /**
     * 设置  字段:sys_role.role_name
     *
     * @param role_name  sys_role.role_name
     */
    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }
}