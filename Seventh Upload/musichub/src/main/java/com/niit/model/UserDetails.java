package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String User_Name;
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	private  int userId;
	private String password;
	private String Address;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(int phone_number) {
		Phone_number = phone_number;
	}
	public String getEMail_Id() {
		return EMail_Id;
	}
	public void setEMail_Id(String eMail_Id) {
		EMail_Id = eMail_Id;
	}
	private int Phone_number;
	private String EMail_Id;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
