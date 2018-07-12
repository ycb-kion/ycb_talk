package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.AdminDao;
import com.dao.UserDao;
import com.po.Admin;
import com.po.User;

@Controller
public class LoginController {
	@Resource public AdminDao adminDao;
	@Resource public UserDao userDao;
	
	
	@RequestMapping(value="login.action", method = RequestMethod.POST)
	public String login(HttpServletRequest request,Model model,ModelMap modelMap ){
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
//		System.out.println("月初白"+name+password+role);
		if (role.equals("user")) {
			System.out.println("普通用户");
			User user=userDao.findUsernameAndPassword(name);
//			System.out.println("月初白"+user.toString());
			if (user==null) {
				modelMap.put("error", "不存在此用户！");
				return "forward:/login.jsp";
			} else if (user.getPassword().equals(password)) {
				
				model.addAttribute(user);
				return "user/index_2";
			}else {
				modelMap.put("error", "密码错误！");
				return "forward:/login.jsp";
			}
				
		}
		if (role.equals("admin")) {
			Admin admin=adminDao.findAdminByName(name);
			if (admin == null) {
				modelMap.put("error", "不存在此管理员！");
				return "forward:/login.jsp";
			} else if (admin.getPassword().equals(password)) {
				model.addAttribute(admin);
				List<User> allUsers=userDao.findAllUser();
				modelMap.put("allusers", allUsers);
				return "admin/show_alluser";
			} else {
				modelMap.put("error", "管理员密码错误！");
				return "forward:/login.jsp";
			}
		}
		return null;
		
		

//		String name=request.getParameter("name");
//		String password=request.getParameter("password");
//		System.out.println(name+password);
//		Admin admin=adminDao.findNameAndPassword(name);
//		if (admin.getPassword().equals(password)) {
//			model.addAttribute("admin",admin);
//			return "admin/index_1";
//		}else {
//			return null;
//		}
		
	}

}
