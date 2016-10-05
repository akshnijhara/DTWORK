package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;


public interface CartDAO {
	public void addCart(Cart cart);
	public void deleteCart(Cart cart);
	public Cart getCartById(int cartId);
	public void editCart(Cart cart); 
	public List<Cart> getAllCart();
}
