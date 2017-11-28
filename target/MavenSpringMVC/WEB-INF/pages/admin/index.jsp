<%@page import="com.user.bean.User"%>
<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="js/public/JQuery/jquery-1.12.1.js"></script>
		<script type="text/javascript" src="js/project/admin/index.js"></script>
		<link rel="stylesheet" type="text/css" href="css/skin1/index.css">
		<title>管理员端首页</title>
	</head>
	<body>
		<p>管理员端首页</p>
		<c:choose>
		    <c:when test="${sessionScope.loginUser.userName != null}">
				${sessionScope.loginUser.userName}你好！
				<a id="toInfoEditBtn" class="my-btn">个人信息维护</a>
				<a id="adminLogoutBtn" class="my-btn">退出</a>
		    </c:when>
		    <c:otherwise>
			    <a id="toAdminLoginBtn" class="my-btn">登录</a>
		    </c:otherwise>
	    </c:choose>
</body>
</html>