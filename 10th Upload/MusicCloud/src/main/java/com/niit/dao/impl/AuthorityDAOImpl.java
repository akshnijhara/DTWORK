package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.AuthorityDAO;
import com.niit.model.Authority;
import com.niit.model.Users;
@Repository
public class AuthorityDAOImpl implements AuthorityDAO{
@Autowired 
private SessionFactory sessionFactory;
	public void addAuthority(Authority authority) {
             sessionFactory.getCurrentSession().save(authority);		
	}

	public void deleteAuthority(Authority authority) {
		     sessionFactory.getCurrentSession().delete(authority);		
	}

	public Authority getAuthorityById(int authoritiesId) {
		      return (Authority) sessionFactory.getCurrentSession().get(Authority.class, authoritiesId);
	}




	public List<Authority> getAllAuthority() {
		return  sessionFactory.getCurrentSession().createQuery("from Authority").list();
	}

	public void editAuthority(Authority authority) {
		      sessionFactory.getCurrentSession().update(authority);		
	}

}
