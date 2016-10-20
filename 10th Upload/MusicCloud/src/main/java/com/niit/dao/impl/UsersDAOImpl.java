package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersDAO;
import com.niit.model.Users;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO{
@Autowired
private SessionFactory sessionFactory;

	@Override
	public void addUsers(Users users) {
		sessionFactory.openSession().saveOrUpdate(users);		
	}

	@Override
	public void deleteUsers(Users users) {
		sessionFactory.openSession().delete(users);
		
	}

	@Override
	public Users getUsersById(int userid) {
		return (Users) sessionFactory.openSession().get(Users.class, userid);
	}

	@Override
	public void editUsers(Users users) {
		sessionFactory.openSession().update(users);
		
	}

	@Override
	public List getAllUsers() {
	return	sessionFactory.openSession().createQuery("from Users").list();
	}

}
