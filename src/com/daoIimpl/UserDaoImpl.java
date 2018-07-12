package com.daoIimpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.fenye.Page;
import com.po.Admin;
import com.po.Invitation;
import com.po.User;
@Transactional(readOnly=false)
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User findUsernameAndPassword(String name) {
		// TODO Auto-generated method stub
		String hqlString="from User where username = ?";
		List<User> list=(List<User>)this.getHibernateTemplate().find(hqlString, name);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void addUser(User user) {
		getHibernateTemplate().save(user);
		
	}

	@Override
	public void delect(User user) {
		getHibernateTemplate().delete(user);	
	}

	@Override
	public void uqdateUser(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
	public List<User> findAllUser() {
		return (List<User>) this.getHibernateTemplate().find("from User");
	}

	@Override
	public User getUserByid(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> getUserByname(String name) {
		
		return (List<User>) getHibernateTemplate().find("from User where username = ?", name);
	}

	@Override
	public String getUsernamebyid(Integer id) {
		
		List<String> username=(List<String>) getHibernateTemplate().find("select username from User where user_id = ?", id);
		if (username.size() > 0) {
			return username.get(0);
		} 
		return null;
	}

	@Override
	public String saveUserIcon() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public List<Invitation> queryByPage(final String username, final Page page) {
//		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
//			public Object doInHibernate(Session session)
//					throws HibernateException, SQLException {
//				Query query = session.createQuery("select art from Article art where art.username = ?");
//				//设置参数
//				query.setParameter(0, username);
//				//设置每页显示多少个，设置多大结果。
//				query.setMaxResults(page.getEveryPage());
//				//设置起点
//				query.setFirstResult(page.getBeginIndex());
//				return query.list();
//			}
//		});

}
