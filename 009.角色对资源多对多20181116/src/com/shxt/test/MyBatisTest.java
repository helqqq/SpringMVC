package com.shxt.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shxt.dao.MenuDao;
import com.shxt.dao.RoleDao;
import com.shxt.model.Menu;
import com.shxt.model.Role;
import com.shxt.utils.MyBatisUtils;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年11月6日 下午8:24:35
 * @see com.shxt.test.MyBatisTest
 */

public class MyBatisTest {
    private static final Logger logger = Logger.getLogger(MyBatisTest.class);
    private MenuDao menuDao = null;
    private RoleDao roleDao = null;
    private SqlSession sqlSession = null;

    @After
    public void a() {
        if (sqlSession != null) {
            MyBatisUtils.closeSqlSession(sqlSession);
        }
    }

    @Before
    public void b() {
        sqlSession = MyBatisUtils.getSqlSession();
        menuDao = sqlSession.getMapper(MenuDao.class);
        roleDao = sqlSession.getMapper(RoleDao.class);
    }

    @Test
    public void test01() {
        List roleList = new ArrayList();
        Role role = new Role();
        role.setRole_name("管理员2");
        roleList.add(role);
        role = new Role();
        role.setRole_name("教师2");
        roleList.add(role);
        role = new Role();
        role.setRole_name("学生2");
        roleList.add(role);
        roleDao.addRoleList(roleList);
        sqlSession.commit();
        List list = roleDao.loadAllRole();
    }

    @Test
    public void test02() {
        List menuList = new ArrayList();
        Menu menu = new Menu();
        menu.setMenu_name("指标管理");
        menu.setUrl("http://www.baidu.com");
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_name("计划管理");
        menu.setUrl("http://www.sina.com");
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_name("支付管理");
        menu.setUrl("http://www.github.com");
        menuList.add(menu);
        this.menuDao.addMenu(menuList);
        this.sqlSession.commit();

    }

    @Test
    public void test03() {
        List menuList = new ArrayList();
        Menu menu = new Menu();
        menu.setMenu_id(1);
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_id(2);
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_id(3);
        menuList.add(menu);
        Role role = new Role();
        role.setRole_id(1);
        this.roleDao.deleteRoleMenuLinkByRole(role);
        this.roleDao.addRoleMneu(role, menuList);
        this.sqlSession.commit();
    }

    /**
     * @description 事务 allowMultiQueries = true jdbc.preproties
     * @作者:Helena
     * @date 2018-11-08
     */
    @Test
    public void test04() {
        List menuList = new ArrayList();
        Menu menu = new Menu();
        menu.setMenu_id(1);
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_id(2);
        menuList.add(menu);
        menu = new Menu();
        menu.setMenu_id(3);
        menuList.add(menu);
        Role role = new Role();
        role.setRole_id(1);
        this.roleDao.addRoleMneu02(role, menuList);
        this.sqlSession.commit();
    }

    @Test
    public void test05() {
        logger.debug(this.roleDao.loadRole(1));
    }
}
