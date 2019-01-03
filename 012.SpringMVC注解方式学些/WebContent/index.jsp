<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("path", path);
	pageContext.setAttribute("basePath", basePath);
%>
<!DOCTYPE HTML>
<html>
	<head>

		<base href="${basePath}">
		<meta charset="UTF-8">
		<title>H5模版:</title>
	</head>
	<body>
		<h2>Ambiguous：RequestMethos.POST GET</h2>
		<form action="mss" method="post">
            <input  type="submit" value="测试post"/>
        </form>
        <br/>
        <form action="mss" method="get">
            <input type="submit" value="测试get"></button>
         </form>
         <br/>
         <form action="mss" method="post">
            <input type = "text" hidden="true" name="_method" value = "put"/>
            <input type="submit" value="测试put"/>
         </form>
         <br/>
         <form action="mss" method="post">
            <input type="text" hidden="true" name="_method" value="delete"/>
            <input type="submit" value="测试delete" />
         </form>
	</body>
</html>