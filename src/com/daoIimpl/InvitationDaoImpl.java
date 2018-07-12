package com.daoIimpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dao.InvitationDao;
import com.po.Invitation;
@Transactional(readOnly=false)
public class InvitationDaoImpl extends HibernateDaoSupport implements InvitationDao {

	@Override
	public List<Invitation> findAllInvitationByUser_id(Integer user_id) {
		List<Invitation> invitations=(List<Invitation>) getHibernateTemplate().find("form Invitation where user_id = ?", user_id);
		if (invitations.size()>0) {
			return invitations;
		}
		return null;
	}

	@Override
	public List<Invitation> findAllInvitation() {
		return (List<Invitation>) getHibernateTemplate().find("from Invitation");
	}

	@Override
	public void addInvitationByUser_id() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delectInvitation() {
		// TODO Auto-generated method stub
		
	}

}
