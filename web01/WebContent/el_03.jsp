<%@page import="com.shxt.model.User"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% %>
<%
    //项目的发布路径，例如:  /rabc
    String path = request.getContextPath();
    /*
    全路径，形式如下: http://127.0.0.1:8001/rbac/
    request.getScheme()      ——> http 获取协议
    request.getServerName()  --> 127.0.0.1 获取服务名
    request.getServerPort()  --> 8001 获取端口号
    path                     --> /rbac 获取访问的路径 路
    */
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%-- 
	<base/>标签解决路径问题
	参考文章:http://www.cnblogs.com/muqianying/archive/2012/03/16/2400280.html
--%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>H5模版:</title>
</head>
<body>
    <h2>el表达式:取对象中的值</h2>
    <%
    
    User user = new User("helq","Helena");
    Map<String,Object> map = new HashMap();
    map.put("age",100);
    user.setMap(map);
    request.setAttribute("user", user);

    %>

    username :${requestScope.user.username }
    <br />
    account :${requestScope.user["account"] }
    <br />
   company:
    <input type = "text" value = '${requestScope["user"]["map"].age }'/><br/>
</body>
</html>