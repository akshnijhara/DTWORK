package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.AuthorityDAO;
import com.niit.model.Authority;

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
		return  sessionFactory.getCurrentSession().createQuery("freo Authority").list();
	}

	public void editAuthority(Authority authority) {
		      sessionFactory.getCurrentSession().update(authority);		
	}

}
