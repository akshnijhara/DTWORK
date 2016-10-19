package com.niit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.BillingAddress;
import com.niit.model.Customer;
import com.niit.model.ShippingAddress;
import com.niit.service.CustomerService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/Register")
	public String registerCustomer(Model model){
	Customer customer = new Customer();
	BillingAddress billingAddress = new BillingAddress();
	ShippingAddress shippingAddress = new ShippingAddress();
	customer.setBillingAddress(billingAddress);
	customer.setShippingAddress(shippingAddress);
	model.addAttribute("customer", customer);
	return "Register";
	}
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String registerCustomerPost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model){
	if(result.hasErrors()){
	return "Register";
	}
	List<Customer> customerList = customerService.getAllCustomers();
	for (int i=0; i< customerList.size(); i++){
	if(customer.getCustomerEmail().equals(customerList.get(i).getCustomerEmail())){
	model.addAttribute("emailMsg", "Email already exists");
	return "Register";
	}
	if(customer.getUsername().equals(customerList.get(i).getUsername())){
	model.addAttribute("usernameMsg", "Username already exists");
	return "Register";
	}
	}
	customer.setEnabled(true);
	customerService.addCustomer(customer);
	return "Login";
	}
	} 

