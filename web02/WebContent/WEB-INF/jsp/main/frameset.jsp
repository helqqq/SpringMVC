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
        <style type="text/css">
            frame{
               border:1px solid #ccc; 
            }
        </style>
	</head>
	<frameset rows="100,*" border="0">
        <frame src="sys/top" noresize="noresize" scrolling="no" frameborder="0" />
        <frameset cols="187,*" >
            <frame src="sys/left" noresize="noresize" frameborder="0"/>
            <frame src="sys/right"  frameborder="0" name = "rightFrame"/>
        </frameset>
    </frameset>
</html>