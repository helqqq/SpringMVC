package com.shxt.dao;

import com.shxt.base.BaseDao;
import com.shxt.model.User;

/**
 *
 * <p>
 * 描述该类情况 {@link 代表跟谁有关系}
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年6月3日 下午12:58:52
 * @see 新建|修改|放弃
 * @see com.shxt.dao.UserDao
 */

public interface UserDao extends BaseDao<User> {
    User login();

}
