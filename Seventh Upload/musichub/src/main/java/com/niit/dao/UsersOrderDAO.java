package com.niit.dao;

import java.util.List;

import com.niit.model.UsersOrder;

public interface UsersOrderDAO {
public void addUsersOrder(UsersOrder usersOrder);
public void deleteUsersOrder(UsersOrder usersOrder);
public UsersOrder getUsersOrderById(int orderId);
public void editUsersOrder(UsersOrder usersOrder);
public List<UsersOrder> getAllUsersOrder();
}
