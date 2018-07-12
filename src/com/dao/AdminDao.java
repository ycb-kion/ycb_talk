package com.dao;

import java.util.List;
import com.po.Admin;

public interface AdminDao {
//	public List<Admin> findAllAdmin();
	public Admin findAdminByName(String name);
	
}
