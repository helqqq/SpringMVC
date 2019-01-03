/**
 * UserDao.java
 *
 * @author：何丽谦
 *             2016年6月4日
 *             com.shxt.dao.UserDao
 *             Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.shxt.model.User;

/**
 * 描述：用户的数据访问层
 *
 * @author 何丽谦
 * @since 1.0
 * @date 2016年6月4日 上午10:27:47
 * @see 新建|修改|放弃
 * @see com.shxt.dao.UserDao
 */

public interface UserDao {
    List<User> list();

    User query(String accouont);

    User query02(Map<String, Object> map);

    User query03(@Param("account") String account, @Param("id") String id);

    User query04(String account, String id);

    User query05(Map<String, Object> map);
}
