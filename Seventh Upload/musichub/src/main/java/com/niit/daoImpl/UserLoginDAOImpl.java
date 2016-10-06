package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserLoginDAO;
import com.niit.model.UserLogin;

@Repository
public class UserLoginDAOImpl implements UserLoginDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addUserLogin(UserLogin userLogin) {
		sessionFactory.getCurrentSession().save(userLogin);		
	}

	public void deleteUserLogin(UserLogin userLogin) {
		sessionFactory.getCurrentSession().delete(userLogin);		
	}

	public UserLogin getUserLoginById(int usersId) {
		return (UserLogin) sessionFactory.getCurrentSession().get(UserLogin.class, usersId);
	}

	public void editUserLogin(UserLogin userLogin) {
		sessionFactory.getCurrentSession().update(userLogin);
		
	}

	public List<UserLogin> getAllUserLogin() {
		return sessionFactory.getCurrentSession().createQuery("from UserLogin").list();
	}

}
