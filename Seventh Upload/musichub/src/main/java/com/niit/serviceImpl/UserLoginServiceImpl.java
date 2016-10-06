package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserLoginDAO;
import com.niit.model.UserLogin;
@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginDAO {
@Autowired
private UserLoginDAO userLoginDAO;
	public void addUserLogin(UserLogin userLogin) {
		userLoginDAO.addUserLogin(userLogin);		
	}

	public void deleteUserLogin(UserLogin userLogin) {
		userLoginDAO.deleteUserLogin(userLogin);		
	}

	public UserLogin getUserLoginById(int usersId) {
		return userLoginDAO.getUserLoginById(usersId);
	}

	public void editUserLogin(UserLogin userLogin) {
		userLoginDAO.editUserLogin(userLogin);		
	}

	public List<UserLogin> getAllUserLogin() {
		return userLoginDAO.getAllUserLogin();
	}

}
