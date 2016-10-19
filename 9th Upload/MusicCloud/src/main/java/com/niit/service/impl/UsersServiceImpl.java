package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersDAO;
import com.niit.model.Users;
import com.niit.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	@Override
	public void addUsers(Users users) {
		usersDAO.addUsers(users);		
	}

	@Override
	public void deleteUsers(Users users) {
		usersDAO.deleteUsers(users);		
	}

	@Override
	public Users getUsersById(int userid) {
	return	usersDAO.getUsersById(userid);	}

	@Override
	public void editUsers(Users users) {
		usersDAO.editUsers(users);		
	}

	@Override
	public List<Users> getAllUsers() {
		return usersDAO.getAllUsers();
	}

}
