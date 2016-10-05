package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartItemDAO;
import com.niit.model.CartItem;

@Repository
public class CartItemDAOImpl implements CartItemDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().save(cartItem);
		
	}

	public void deleteCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().delete(cartItem);
		
	}

	public CartItem getCartItemById(int cartItemId) {
		return (CartItem) sessionFactory.getCurrentSession().get(CartItem.class, cartItemId);
	}

	public void editCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().update(cartItem);		
	}

	public List<CartItem> getAllCartItems() {
		return sessionFactory.getCurrentSession().createQuery("from CartItem").list();
	}

}
