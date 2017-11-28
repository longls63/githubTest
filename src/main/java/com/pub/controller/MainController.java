package com.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	/**
	 * 访问客户端主页，默认进入client/index.jsp
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/")
	public ModelAndView toClientIndex() throws Exception {
		return new ModelAndView("client/index");// 跳转至pages/client下的index.jsp
	}

	/**
	 * 访问管理员端主页，默认进入admin/login.jsp
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("admin")
	public ModelAndView toAdminLogin() throws Exception {
		return new ModelAndView("admin/login");// 跳转至pages/admin/login.jsp
	}

	/**
	 * 访问客户端登录界面，进入client/login.jsp
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("client.do")
	public ModelAndView toClientLogin() throws Exception {
		return new ModelAndView("client/login");// 跳转至pages/client/login.jsp
	}

}
