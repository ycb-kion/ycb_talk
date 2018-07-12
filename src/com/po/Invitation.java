package com.po;

public class Invitation {
	
	private int invi_id;
//	private String username;
	private String title;
	private String content;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private User user;
	
	public int getInvi_id() {
		return invi_id;
	}
	public void setInvi_id(int invi_id) {
		this.invi_id = invi_id;
	}
	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
