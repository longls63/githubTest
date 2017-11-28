
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
		<script type="text/javascript" src="js/project/client/index.js"></script>
		<link rel="stylesheet" type="text/css" href="css/skin1/index.css">
		<title>用户端首页</title>
	</head>
	<body id="box">
		<p>用户端首页信息..............................................................</p>
	    <c:choose>
		    <c:when test="${sessionScope.loginUser.userName != null}">
				${sessionScope.loginUser.userName}你好！
				<a id="clientLogoutBtn" class="my-btn">退出</a>
		    </c:when>
		    <c:otherwise>
			    <a id="toClientLoginBtn" class="my-btn">登录</a>
				<a id="toRegisterBtn" class="my-btn">注册</a>
		    </c:otherwise>
	    </c:choose>
</body>
</html>