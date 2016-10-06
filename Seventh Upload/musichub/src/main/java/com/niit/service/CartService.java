package com.niit.service;

import java.util.List;

import com.niit.model.Cart;

public interface CartService {
	public void addCart(Cart cart);
	public void deleteCart(Cart cart);
	public Cart getCartById(int cartId);
	public void editCart(Cart cart); 
	public List<Cart> getAllCart();
}
