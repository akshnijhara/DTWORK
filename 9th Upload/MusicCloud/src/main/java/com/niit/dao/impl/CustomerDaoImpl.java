package com.niit.dao.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CustomerDAO;
import com.niit.model.Authority;
import com.niit.model.Customer;
import com.niit.model.Users;

import java.util.List;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDAO{
@Autowired
private SessionFactory sessionFactory;

public void addCustomer(Customer customer){
Session session = sessionFactory.openSession();
customer.getBillingAddress().setCustomer(customer);
customer.getShippingAddress().setCustomer(customer);
session.saveOrUpdate(customer);
session.saveOrUpdate(customer.getBillingAddress());
session.saveOrUpdate(customer.getShippingAddress());
Users newUser = new Users();
newUser.setUsername(customer.getUsername());
newUser.setPassword(customer.getPassword());
newUser.setEnabled(true);
newUser.setUserid(customer.getCustomerId());
Authority newAuthorities = new Authority();
newAuthorities.setUsername(customer.getUsername());
newAuthorities.setAuthority("ROLE_USER");
session.saveOrUpdate(newUser);
session.saveOrUpdate(newAuthorities);
//Cart newCart = new Cart();
//newCart.setCustomer(customer);
//customer.setCart(newCart);
session.saveOrUpdate(customer);
//session.saveOrUpdate(newCart);

}
public Customer getCustomerById(int customerId){
Session session = sessionFactory.openSession();
return (Customer) session.get(Customer.class, customerId);
}
public List<Customer> getAllCustomers(){
Session session = sessionFactory.openSession();
Query query = session.createQuery("from Customer");
List<Customer> customerList = query.list();
return customerList;
}
public Customer getCustomerByUsername(String username){
Session session = sessionFactory.openSession();
Query query = session.createQuery("from Customer where username = ?");
query.setString(0, username);
return (Customer) query.uniqueResult();
}
}