package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UsersOrderDAO;
import com.niit.model.UsersOrder;

@Repository
public class UsersOrderDAOImpl implements UsersOrderDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addUsersOrder(UsersOrder usersOrder) {
		sessionFactory.getCurrentSession().save(usersOrder);		
	}

	public void deleteUsersOrder(UsersOrder usersOrder) {
		sessionFactory.getCurrentSession().delete(usersOrder);		
	}

	public UsersOrder getUsersOrderById(int orderId) {
	return	(UsersOrder) sessionFactory.getCurrentSession().get(UsersOrder.class, orderId);
	}

	public void editUsersOrder(UsersOrder usersOrder) {
		sessionFactory.getCurrentSession().update(usersOrder);
		
	}

	public List<UsersOrder> getAllUsersOrder() {
	return	sessionFactory.getCurrentSession().createQuery("from UsersOrder").list();
	}
	

}
