package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdminDao;
import com.po.Admin;


@Controller
public class AdminController {
	//dao注入
//	@Resource
//	public AdminDao adminDao;
	
	
	/**
	 * Admin登陆
	 * @param request
	 * @param model
	 * @return
	 */
//	@RequestMapping(value="login.action", method = RequestMethod.POST)
//	public String login(HttpServletRequest request, Model model ){
//		String name=request.getParameter("name");
//		String password=request.getParameter("password");
//		System.out.println(name+password);
////		Admin findNameAndPassword(Admin admin)
//		Admin admin=adminDao.findAdminByName(name);
//		if (admin.getPassword().equals(password)) {
//			model.addAttribute("admin",admin);
//			return "admin/index_1";
//		}else {
//			return null;
//		}	
//	}
	
	
	
}
//@RequestMapping(value="update.do", method = RequestMethod.POST)
//public String updateUser(HttpServletRequest request,Model model){
//	String id=request.getParameter("uid");
//	String openid=request.getParameter("uopenid");
//	String nickName=request.getParameter("unickName");
//	String gender=request.getParameter("ugender");
//	String avatarUrl=request.getParameter("uavatarUrl");
//	String city=request.getParameter("ucity");
//	String logintime=request.getParameter("ulogintime");
//	System.out.println("月初白"+id+openid);
//	System.out.println("姓名"+nickName);
//	System.out.println("姓别"+gender);
//	System.out.println("城市"+city);
//	System.out.println("登陆时间"+logintime);
