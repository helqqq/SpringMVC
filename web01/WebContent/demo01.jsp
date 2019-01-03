<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
		<h2>JSP的九个内置对象</h2>
        <%--
            JSP的注释
            关于WEB域的九个内置对象[取值-传递数据用的]
            page/pageCount:当前界面有效
            request:在一次请求转发中有效
            session:在一次会话当中有效
            application:在服务器范围内有效
            其他：
            response:相应 setContentType("text/html;charset=UTF-8");
            out:输出
            exception:
            config:读取初始化的信息--web.xml[部署描述符]
            
         --%>
         <%--
            JSP和servlet的关系：jsp就是servlet,原来是在servlet里面写关于html的信息的
          --%>

		
	</body>
</html>