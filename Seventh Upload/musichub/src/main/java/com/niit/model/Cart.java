package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int cartId;
	private double grandTotal;
	
	@OneToOne
	@JoinColumn(name="userid")
	@JsonIgnore
	private Users users;
	
	@OneToMany(mappedBy="cart", cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CartItem> cartItems;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
}
