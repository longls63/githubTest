/**
 * 管理端首页js
 */

$(function() {
	$("#toAdminLoginBtn").click(function(){
		window.location = "admin";//退出登录，跳转至admin/login.jsp
	});
	
	$("#adminLogoutBtn").click(function(){
		window.location = "admin/logout.do";//退出登录，跳转至client/index.jsp
	});
});