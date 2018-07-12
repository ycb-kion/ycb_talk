package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.InvitationDao;
import com.po.Invitation;
import com.po.User;

import freemarker.ext.beans.MapModel;

@Controller
public class InvitationController {
	@Resource
	public InvitationDao invitationDao;
	
	//该用户下所有的invitation
	public Invitation getInvitationById(User user,Model model){
//		List<Invitation> findAllInvitationByUser_id(Integer id);
		int id=user.getUser_id();
//		int user_id=Integer.parseInt(request.getParameter("user_id"));
		List<Invitation> invitations=invitationDao.findAllInvitationByUser_id(id);
		model.addAttribute(invitations);
		return null;
	}
	
	//显示所有的贴子
	@RequestMapping(value="show.action")
	public String showInvitation(ModelMap model){
//		Invitation findAllInvitation();
		List<Invitation> invitations=invitationDao.findAllInvitation();
		model.put("invitations", invitations);
		return "user/index_main";
	}
	
	
	

}
