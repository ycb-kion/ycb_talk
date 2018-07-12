package com.dao;

import java.util.List;

import com.po.Invitation;

public interface InvitationDao {
	
	
	//获取当前用户的所有帖子(管理自己的贴子)
	public List<Invitation> findAllInvitationByUser_id(Integer id);
	
	//获取所有的贴子（主页，管理员）
	public List<Invitation> findAllInvitation();
	
	//添加帖子（用户）
	public void addInvitationByUser_id();
	
	//删除帖子
	public void delectInvitation();
	
	
	
}
