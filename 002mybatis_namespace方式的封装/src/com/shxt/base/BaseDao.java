/**
 * BaseDao.java
 *
 * @author：Helena
 *                2018-06-26
 *                com.shxt.base.BaseDao
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.base;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Helena
 * @since 1.0
 * @date 2018年6月26日 下午7:51:59
 * @see com.shxt.base.BaseDao
 */
@SuppressWarnings("rawtypes")
public interface BaseDao<T> {

    public int add(T t);

    public int delete(Integer id, Class clazz);

    public List<T> list(Class clazz);

    public List<T> list(Map<String, Object> map, Class clazz);

    public T load(Integer id, Class clazz);

    public T query(Map<String, Object> map, Class clazz);

    public int update(T t);

}
