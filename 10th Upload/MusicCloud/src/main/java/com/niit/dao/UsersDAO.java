package com.niit.dao;

import java.util.List;

import com.niit.model.Users;

public interface UsersDAO {
public void addUsers(Users users);
public void deleteUsers(Users users);
public Users getUsersById(int userid);
public void editUsers(Users users);
public List getAllUsers();
}
