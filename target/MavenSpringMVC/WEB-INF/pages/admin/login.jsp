
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<title>管理员登录</title>
	</head>
	<body>
		<p>管理员登录信息更改。。。。。。。。。</p>
		<form action="admin/login.do" method="post">
			用户名：<input type="text" name="userName" value="admin" /><br>
			密    码：<input type="password" name="password" value="123456"><br>
			<input type="submit" value="登录">	
			<input type="reset" value="重置" />
		</form>
	</body>
</html>
