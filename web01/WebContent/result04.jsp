<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
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
        <script type="text/javascript" src = "jquery.js"></script>
         <script type="text/javascript">
        $(function(){
               var status = $("#status").val(); 
               $("#sel").val(status);
               $("input[type='radio']").each(function(){
                   if($(this).val() == status){
                      $(this).attr("checked",true); 
                      return;
                   }
               });
        });
       </script>
	</head>
	<body>
		<h2>jstl:c标签的使用</h2>
        <%=request.getAttribute("shxt") %>
        ${requestScope.user_name } 
        <hr/>
          ${requestScope.car } 
        <hr/>
        <c:out value="${user_name }" escapeXml="false"></c:out>
        <hr/>
        <c:out value="${book }" escapeXml="false"></c:out>
        <hr/>
        <c:out value="${user_name11 }" escapeXml="false"><font color = 'red'>暂无用户名</font></c:out>
        
        <h1>c标签之if else</h1>
        <c:if test="${status eq 1 }">
            <font color = 'green'>可用</font>
        </c:if>
        <c:if test="${status ne 1 }">
            <font color = 'red'>禁用</font>
        </c:if> 
        <hr/>
       <c:if test="${status eq 2 }" var = "isAvail">
            <font color = 'green'>可用</font>
       </c:if>
       <c:if test="${!isAvail }">
            <font color = 'red'>禁用</font>
       </c:if>
       <h2 style="color:red">实战练习：jstl/jQuery</h2>
        <select>
            <option value = "">请选择状态</option>
            <option value = "1" 
                <c:if test="${status eq 1 }"> selected = 'selected'</c:if>
             >可用</option>
            <option value = "2"
                <c:if test="${status eq 2 }"> selected  = 'selected'</c:if>
            >禁用</option>
        </select>
        <hr/>
        <select id = "sel">
            <option value = "">--请选择状态--</option>
            <option value = "1">启用</option>
            <option value = "2">禁用</option>
        </select>
        <hr/>
        <input type = "radio" value = "1" />男
        <input type = "radio" value = "2" />女
        <hr/>
        <input type = "text" value = "${status }" id = "status" hidden="hidden">
        
        <c:choose>
            <c:when test="${shxt eq '四海兴唐' }">三生三世十里桃花</c:when>
            <c:when test="${shxt eq 'dd' }">dd</c:when>
            <c:otherwise>HAHA</c:otherwise>
        </c:choose>
        <hr/>
       东八区：${date } 
       <hr/>
      格式化 <fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm:ss"/><hr/>
       日期：
       <input type = "text" value= "<fmt:formatDate value='${date }' pattern = 'yyyy-MM-dd HH:mm:ss'/>"/>
       <h3 style="color:red">c标签之迭代</h3>
       行号--第一--最后--索引--用户名--账号<br/>
       <c:forEach items="${dataList }" varStatus="vs" var="data" ><!-- begin="1" end="3" step="2" -->
       ${vs.count }--${vs.first }--${vs.last }--${vs.index }--${data.user_name} --${data.account }<br/>
       </c:forEach>
      一共：${dataList.size() }条
   <%--    静态包含：
        <%@include file="inc100.jsp" %>
      动态包含：
       <jsp:include page="inc100.jsp"></jsp:include> --%>
      
      
	</body>
</html>