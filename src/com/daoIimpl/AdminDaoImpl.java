package com.daoIimpl;


import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDao;
import com.po.Admin;
@Transactional(readOnly=false)
public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {
	
	public Admin findAdminByName(String name) {
		//管理员是唯一的
//		String hqlString="from Admin where name = ?";
//		return (List<Admin>)this.getHibernateTemplate().find(hqlString, name);
		
//		return (Admin)getHibernateTemplate().find("from Admin where name=?", name);	
		String hqlString="from Admin where name = ?";
		List<Admin> list=(List<Admin>)this.getHibernateTemplate().find(hqlString, name);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}
}
