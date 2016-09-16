package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin {

	@Id
	private String userId;
	private String passsword;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	
	
}
