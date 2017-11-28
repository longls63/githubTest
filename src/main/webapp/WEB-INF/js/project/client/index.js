/**
 * 用户端首页js
 */

$(function() {
	$("#toClientLoginBtn").click(function(){
		window.location = "client.do";//跳转至client/login.jsp
	});
	
	$("#clientLogoutBtn").click(function(){
		window.location = "client/logout.do";//退出登录，跳转至client/index.jsp
	});
});

