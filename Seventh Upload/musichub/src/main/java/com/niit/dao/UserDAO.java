package com.niit.dao;

import java.util.List;

import com.niit.model.Users;

public interface UserDAO {
	public void addUser(Users users);
	public void deleteUser(Users users);
	public Users getUserById(int userId);
	public void editUser(Users user); 
	public List<Users> getAllUsers();
}
