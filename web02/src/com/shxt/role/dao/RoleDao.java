/**
 * RoleDao.java
 * ©2006-2016 四海兴唐科技有限公司 
 * All rights reserved.
 * <link>胖先生作品</link>
 * 创建于: 2018-11-09 21:28:20
 **/
package com.shxt.role.dao;

import com.shxt.role.model.Role;

public interface RoleDao {
    /**
     * sys_role
     * 方法描述:
     * @param  
     * @return 
     * @throws 
     * @author 胖先生
     * @date 2018-11-09 21:28:20
     * 
     **/
    int delete(Integer role_id);

    /**
     * sys_role
     * 方法描述:
     * @param  
     * @return 
     * @throws 
     * @author 胖先生
     * @date 2018-11-09 21:28:20
     * 
     **/
    int add(Role role);

    /**
     * sys_role
     * 方法描述:
     * @param  
     * @return 
     * @throws 
     * @author 胖先生
     * @date 2018-11-09 21:28:20
     * 
     **/
    Role load(Integer role_id);

    /**
     * sys_role
     * 方法描述:
     * @param  
     * @return 
     * @throws 
     * @author 胖先生
     * @date 2018-11-09 21:28:20
     * 
     **/
    int update(Role role);
}