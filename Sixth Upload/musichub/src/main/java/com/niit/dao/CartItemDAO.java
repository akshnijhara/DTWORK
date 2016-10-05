package com.niit.dao;

import java.util.List;

import com.niit.model.CartItem;



public interface CartItemDAO {
	public void addCartItem(CartItem cartItem);
	public void deleteCartItem(CartItem cartItem);
	public CartItem getCartItemById(int cartItemId);
	public void editCartItem(CartItem cartItem); 
	public List<CartItem> getAllCartItems();
}
