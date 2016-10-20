package com.niit.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Users implements Serializable {
	private static final long serialVersionUID = -5537410551048072156L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String username;
	private String password;
	private String mobile;
	private String email;
	private String address;
	
	private boolean enabled;
	


    public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/* @OneToOne
    @JoinColumn(name = "billsId")
    private BillingAddress billingAddress;

   @OneToOne
    @JoinColumn(name = "shipId")
    private ShippingAddress shippingAddress;
    
    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;*/

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

		public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
*/


}
