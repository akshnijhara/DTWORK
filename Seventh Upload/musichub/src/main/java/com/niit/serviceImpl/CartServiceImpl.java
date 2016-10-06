package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;
import com.niit.service.CartService;
@Service
@Transactional
public class CartServiceImpl implements CartService{
@Autowired
private CartDAO cartDAO;
	public void addCart(Cart cart) {
		cartDAO.addCart(cart);
		
	}

	public void deleteCart(Cart cart) {
		cartDAO.deleteCart(cart);
		
	}

	public Cart getCartById(int cartId) {
		return cartDAO.getCartById(cartId);	
		}

	public void editCart(Cart cart) {
		cartDAO.editCart(cart);
	}

	public List<Cart> getAllCart() {
		return cartDAO.getAllCart();
	}

}
