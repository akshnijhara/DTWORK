package com.niit.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.CartItem;
import com.niit.service.CartItemService;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{

	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	public CartItem getCartItemById(int cartItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void editCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	public List<CartItem> getAllCartItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
