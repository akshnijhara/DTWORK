package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersOrderDAO;
import com.niit.model.UsersOrder;
import com.niit.service.UsersOrderService;

@Service
@Transactional
public class UsersOrderServiceImpl implements UsersOrderService{
@Autowired
private UsersOrderDAO usersOrderDAO;
	public void addUsersOrder(UsersOrder usersOrder) {
		usersOrderDAO.addUsersOrder(usersOrder);		
	}

	public void deleteUsersOrder(UsersOrder usersOrder) {
		usersOrderDAO.deleteUsersOrder(usersOrder);		
	}

	public UsersOrder getUsersOrderById(int orderId) {
		return usersOrderDAO.getUsersOrderById(orderId);
	}

	public void editUsersOrder(UsersOrder usersOrder) {
		usersOrderDAO.editUsersOrder(usersOrder);		
	}

	public List<UsersOrder> getAllUsersOrder() {
	return	usersOrderDAO.getAllUsersOrder();
	}

}
