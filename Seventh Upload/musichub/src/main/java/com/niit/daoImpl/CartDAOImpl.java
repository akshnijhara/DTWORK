package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;
@Repository
public class CartDAOImpl implements CartDAO {
@Autowired
private SessionFactory sessionFactory;
	public void addCart(Cart cart) {
		sessionFactory.getCurrentSession().save(cart);
		
	}

	public void deleteCart(Cart cart) {
		sessionFactory.getCurrentSession().delete(cart);
		
	}

	public Cart getCartById(int cartId) {
		return (Cart) sessionFactory.getCurrentSession().get(Cart.class, cartId);
	}

	public void editCart(Cart cart) {
		sessionFactory.getCurrentSession().update(cart);
		
	}

	public List<Cart> getAllCart() {
	return	sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

}
