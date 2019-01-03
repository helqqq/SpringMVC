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

		<base href="${basePath }">
		<meta charset="UTF-8">
		<title>H5模版:</title>
        <style type="text/css">
            *{
                margin:0px;
                padding:0px;
             }
            iframe{
                width:100%;
                height:768px;
                border:none;
            }
        </style>
	</head>
	<body>
		<iframe src="frameset"></iframe>
		
	</body>
</html>