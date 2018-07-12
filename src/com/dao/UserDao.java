package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.po.User;

public interface UserDao {
	//登陆用的查找
	public User findUsernameAndPassword(String name);
	//添加用户
	public void addUser(User user);
	//删除用户
	public void delect(User user);
	//修改用户
	public void uqdateUser(User user);
	//查找所有用户
	public List<User> findAllUser();
	//根据id查找用户
	public User getUserByid(Integer id);
	//根据name查找用户
	public List<User> getUserByname(String name);
	//根据id查找用户名
	public String getUsernamebyid(Integer id);
	//添加或修改用户头像
	public String saveUserIcon();
	
	 
	
}
