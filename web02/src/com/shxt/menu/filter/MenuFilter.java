package com.shxt.menu.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shxt.menu.model.Menu;
import com.shxt.menu.service.impl.MenuServiceImpl;
import com.shxt.user.model.User;

/**
 * Servlet Filter implementation class MenuFilter
 */
@WebFilter("/sys/left")
public class MenuFilter implements Filter {

    public MenuFilter() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("session_user");
        String menuListId = "menuList" + user.getId() + user.getFk_role_id();
        if (session.getAttribute(menuListId) == null) {
            session.setAttribute("menuListId", "menuList" + user.getId() + user.getFk_role_id());
            List<Menu> menuList = new MenuServiceImpl().loadMenuByRole(user.getFk_role_id());
            session.setAttribute(menuListId, menuList);
        }
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }

}
