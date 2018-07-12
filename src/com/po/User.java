package com.po;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int user_id;	
    private String username;
    private String emill;    
    private String password; 
    private String sex;
    private Set<Invitation> invitations=new HashSet<Invitation>();
    private String icon;
    
    
    
    public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Set<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(Set<Invitation> invitations) {
		this.invitations = invitations;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmill() {
		return emill;
	}

	public void setEmill(String emill) {
		this.emill = emill;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toString() {
		return "User [id=" + user_id +  ", username="
				+ username + ", password" + password + ", emill=" + emill + ", sex=" + sex 
				+  "]";
	}
	
	
//private int user_id;
//	
//    private String username;
//    
//    private String emill;
//    
//    private String password;
//    
//    private String sex;
    
//    private Set<Invitation> invitations=new HashSet<Invitation>();
//    
//	public Set<Invitation> getInvitations() {
//		return invitations;
//	}
//
//	public void setInvitations(Set<Invitation> invitations) {
//		this.invitations = invitations;
//	}

	
    

}
