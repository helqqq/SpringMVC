package com.shxt.user.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shxt.log.model.LoginLog;
import com.shxt.log.service.LoginLogService;
import com.shxt.log.service.impl.LoginLogServiceImpl;
import com.shxt.user.model.User;
import com.shxt.user.service.UserService;
import com.shxt.user.service.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容的类型和编码
        response.setContentType("text/html;charset=UTF-8");
        String account = null;
        try {
            response.setCharacterEncoding("UTF-8");
            account = request.getParameter("account");
            String password = request.getParameter("password");
            UserService userService = new UserServiceImpl();
            User user = userService.login(account, password);
            HttpSession session = request.getSession();
            if (session.getAttribute("session_user") == null) {
                LoginLog log = new LoginLog();
                log.setUser_id(user.getId());
                log.setUser_name(user.getUser_name());
                log.setLog_date(new Date());
                log.setIp(request.getRemoteAddr());
                log.setLog_id(UUID.randomUUID().toString());
                LoginLogService logService = new LoginLogServiceImpl();
                logService.add(log);
            }
            session.setAttribute("session_user", user);
            // session.setAttribute(PropertiesConfigHelper.getStringValue("session_id", "session_user"), user);
            response.sendRedirect(request.getContextPath() + "/" + "main");
        } catch (RuntimeException e) {
            request.setAttribute("msg", "用户名或密码不正确！！！");
            request.setAttribute("account", account);
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }
    }

}
