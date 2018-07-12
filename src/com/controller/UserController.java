package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.UserDao;
import com.po.User;
import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;


@Controller
public class UserController {
	
	//注入DAO
	@Resource
	public UserDao userDao;
	
	/**
	 * 显示所有用户
	 * @param model
	 * @return
	 */
	@RequestMapping(value="alluser.action")
	public String showAllUser(ModelMap model){
		List<User> allUsers=userDao.findAllUser();
		model.put("allusers", allUsers);
		return "admin/show_alluser";
	}
	
	/**
	 * 删除指定用户
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="delete.action")
	public String delectUser(HttpServletRequest request,ModelMap model){
		int id=Integer.parseInt(request.getParameter("id"));
		User user=userDao.getUserByid(id);
		userDao.delect(user);
		List<User> alluserList=userDao.findAllUser();
		model.put("allusers", alluserList);
		return "redirect:alluser.action";
	}
	
	/**
	 * 添加用户
	 * @param request
	 * @throws UnsupportedEncodingException
	 */
	@GetMapping("adduser.action")
	public String addUser(User user,Model model,ModelMap modelMap){
		String name=user.getUsername();
		List<User> user2=userDao.getUserByname(name);
		if (user2.size()>0) {
			modelMap.put("error", "用户名已经存在！");
			return "forward:/register.jsp";
		}else {
			userDao.addUser(user);
			model.addAttribute(user);
			return "user/index_2";
		}
	}
	
	/**
	 * 显示所有用户
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="showuser.action")
	public String showUser(HttpServletRequest request,Model model){
		int id=Integer.parseInt(request.getParameter("id"));
		User user=userDao.getUserByid(id);
		model.addAttribute(user);
		return "user/updateuser";
	}
	
	/**
	 * 修改指定用户
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping("update.action")
	public String updateUser(User user,Model model){
		userDao.uqdateUser(user);
		model.addAttribute(user);
		return "user/index_2";
	}
	
}
