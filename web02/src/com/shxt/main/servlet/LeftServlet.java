package com.shxt.main.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LeftServlet
 */
@WebServlet("/sys/left")
public class LeftServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // User
        // HttpSession session = request.getSession();
        // User user = (User) session.getAttribute("session_user");
        // Integer role_id = user.getFk_role_id();
        // List<Menu> menuList = new MenuServiceImpl().loadMenuByRole(role_id);
        // request.setAttribute("menuList", menuList);
        request.getRequestDispatcher("/WEB-INF/jsp/main/left.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
