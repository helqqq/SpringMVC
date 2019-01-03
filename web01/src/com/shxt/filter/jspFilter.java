package com.shxt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class jspFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String path = request.getServletPath();
        if (path.endsWith(".jsp")) {
            // jsp过滤器，重定向到servlet
            response.sendRedirect(request.getContextPath() + "/shxt.do");
            return;
        }
        chain.doFilter(request, response);
        // String path = request.getRequestURI();
        // String servletPath = request.getServletPath();
        // String ip = request.getRemoteAddr();
        // System.out.println("path:" + path);
        // System.out.println("servletPath:" + servletPath);
        // System.out.println("ip:" + ip);
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }

}
