package com.shxt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet(urlPatterns = { "/shxt.do" }, loadOnStartup = 1) // 数字越小，优先加载
public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("shxt", "四海兴唐");
        request.setAttribute("user_name", "<font color = 'red'>何丽谦</font>");
        request.setAttribute("car", "&lt;font color = 'red'&gt;兰博基尼&lt;/font&gt;");
        request.setAttribute("book", "<book>蜀黍</book>");
        request.setAttribute("status", 1);
        request.setAttribute("date", new Date());

        List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user_name", "何丽谦");
        map.put("age", 13);
        map.put("account", "helq");
        dataList.add(map);
        map = new HashMap<String, Object>();
        map.put("user_name", "朱维");
        map.put("age", 15);
        map.put("account", "zhuw");
        dataList.add(map);
        map = new HashMap<String, Object>();
        map.put("user_name", "李旋");
        map.put("age", 15);
        map.put("account", "lix");
        dataList.add(map);
        map = new HashMap<String, Object>();
        map.put("user_name", "王小黑");
        map.put("age", 15);
        map.put("account", "wangxh");
        dataList.add(map);
        map = new HashMap<String, Object>();
        map.put("user_name", "斜阳");
        map.put("age", 15);
        map.put("account", "xiey");
        dataList.add(map);
        request.setAttribute("dataList", dataList);
        request.getRequestDispatcher("/result04.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化了");
        super.init(config);
    }

}
