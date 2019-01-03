package com.shxt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 完整版未整理完毕
 * <p>
 * 描述该类情况 {@link 代表跟谁有关系}
 * </p>
 * 
 * @author 刘文铭
 * @since 1.0
 * @date 2018年5月9日 下午7:23:57
 * @see 新建|修改|放弃
 * @see com.shxt.servlet.UserServlet
 */
@WebServlet(urlPatterns = { "/url" })
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * 接收前台传递过来的Get请求,注意:,尽量不要涉及到中文数据的传递
     * </p>
     * <ul>
     * <li>1.跳转页面[更新|删除]等</li>
     * <li>2.查询操作[对于中文操作不太推荐:如何解决中文乱码问题]</li>
     * </ul>
     *
     * @param request
     * @param response
     * @exception ServletException , IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容的类型和编码
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {// 1.捕获异常 2.处理:让系统自行处理 || 由我们自己处理

            out = response.getWriter();

        } catch (Exception e) {
            e.printStackTrace();// -->在控制台显示详细的信息
            // 1.让系统自行处理,就直接抛出[可以使用自定义异常]
            throw new RuntimeException(e.getMessage());
            // 2.如果我们自己处理
            // request.setAttribute("code", "设置异常编码");
            // request.setAttribute("message", "自定义异常显示信息或者使用e.getMessage()");
        } finally {
            // 关闭资源
            if (out != null) {
                out.flush();
                out.close();
            }

        }
        // 请求转发[服务端请求]:地址栏不发生变化
        // 1. JSP应该放置在WEB-INF文件夹下
        // 2. 请求转发也可以跳转到Servlet
        // 重点: 是以/开头,代表访问的根目录开始
        // request.getRequestDispatcher("/WEB-INF/JSP页面或者HTML等资源").forward(request, response);
        // request.getRequestDispatcher("/Servlet的访问路径").forward(request, response);

        // 重定向[客户端请求]:地址栏发生变化
        // response.sendRedirect(request.getContextPath()+"/JSP或者Servlet");
        // 传递参数的方式
        // Servlet获取-->request.getParameter("name")获取值
        // JSP推荐使用EL表达式获取-->
        // a.param.name或者param["name"]
        // b.paramValues.name}或者paramValues["name"]
        // 注意:使用的方式 request.getContextPath()+"/" 代表从访问的根目录开始
        // response.sendRedirect(request.getContextPath()+"/" + "JSP或者Servlet?name=值&id=值");
    }

    /**
     * <p>
     * 接收前台传递过来的POST请求
     * </p>
     * <ul>
     * <li>1.添加操作建议使用POST请求</li>
     * <li>2.上传必须使用该请求</li>
     * </ul>
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws RuntimeException
     * @see 异常处理一般情况下,使用不受审查的异常信息
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // 设置响应内容的类型和编码
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try {// 1.捕获异常 2.处理:让系统自行处理 || 由我们自己处理
             // 解决POST请求的中文乱码问题
            request.setCharacterEncoding("UTF-8");

            out = response.getWriter();

        } catch (Exception e) {
            e.printStackTrace();// -->在控制台显示详细的信息
            // 1.让系统自行处理,就直接抛出[可以使用自定义异常]
            throw new RuntimeException(e.getMessage());
            // 2.如果我们自己处理
            // request.setAttribute("code", "设置异常编码");
            // request.setAttribute("message", "自定义异常显示信息或者使用e.getMessage()");
        } finally {
            // 关闭资源
            if (out != null) {
                out.flush();
                out.close();
            }

        }
        // 请求转发[服务端请求]:地址栏不发生变化
        // 1. JSP应该放置在WEB-INF文件夹下
        // 2. 请求转发也可以跳转到Servlet
        // 重点: 是以/开头,代表访问的根目录开始
        // request.getRequestDispatcher("/WEB-INF/JSP页面或者HTML等资源").forward(request, response);
        // request.getRequestDispatcher("/Servlet的访问路径").forward(request, response);

        // 重定向[客户端请求]:地址栏发生变化
        // response.sendRedirect(request.getContextPath()+"/JSP或者Servlet");
        // 传递参数的方式
        // Servlet获取-->request.getParameter("name")获取值
        // JSP推荐使用EL表达式获取-->
        // a.param.name}或者param["name"]
        // b.paramValues.name或者paramValues["name"]
        // 注意:使用的方式 request.getContextPath()+"/" 代表从访问的根目录开始
        response.sendRedirect(request.getContextPath() + "/" + "JSP或者Servlet?name=值&id=值");

    }

}
