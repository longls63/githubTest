package com.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.user.bean.User;

@Controller
public class UserController {
	
	Map<String, String> model = new HashMap<String, String>();

	/**
	 * 客户端登录验证，登录成功后跳转至client/index.jsp
	 * 
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("client/login.do")
	public ModelAndView clientLogin(User user, HttpSession session)
			throws Exception {
		if (user == null || user.getUserName() == null
				|| user.getPassword() == null || user.getUserName().equals("")
				|| user.getPassword().equals("")) {
			model.put("msg", "用户名或者密码为空");
			return new ModelAndView("error", model);
		} else if (!user.getUserName().equals("admin")
				|| !user.getPassword().equals("123456")) {
			model.put("msg", "用户名或密码错误！");
			return new ModelAndView("error", model);
		} else {
			model.put("msg", "登录成功");
			session.setAttribute("loginUser", user);// 这里注意要把userId也设置到user中，以方便在前台取用
			return new ModelAndView("client/index", model);// 登录成功后跳转至client/index.jsp
		}
	}

	/**
	 * 客户端退出登录，退出后跳转至client/index.jsp
	 * 
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("client/logout.do")
	public ModelAndView clientLogout(HttpSession session) throws Exception {
		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			session.removeAttribute("loginUser");
		}
		model.put("msg", "已退出登录！");
		return new ModelAndView("client/index", model);// 退出后跳转至client/index.jsp
	}

	/**
	 * 管理员端登录验证，登录成功后跳转至admin/index.jsp
	 * 
	 * @param user
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("admin/login.do")
	public ModelAndView adminLogin(User user, HttpSession session)
			throws Exception {
		if (user == null || user.getUserName() == null
				|| user.getPassword() == null || user.getUserName().equals("")
				|| user.getPassword().equals("")) {
			model.put("msg", "用户名或者密码为空");
			return new ModelAndView("error", model);
		} else if (!user.getUserName().equals("admin")
				|| !user.getPassword().equals("123456")) {
			model.put("msg", "用户名或密码错误！");
			return new ModelAndView("error", model);
		} else {
			model.put("msg", "登录成功");
			session.setAttribute("loginUser", user);// 这里注意要把userId也设置到user中，以方便在前台取用
			return new ModelAndView("admin/index", model);
		}
	}

	/**
	 * 管理端退出登录，退出后跳转至admin/index.jsp
	 * 
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("admin/logout.do")
	public ModelAndView adminLogout(HttpSession session) throws Exception {
		User loginUser = (User) session.getAttribute("loginUser");
		if (loginUser != null) {
			session.removeAttribute("loginUser");
		}
		model.put("msg", "已退出登录！");
		return new ModelAndView("admin/index", model);// 退出后跳转至client/index.jsp
	}

}
