package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.BillingAddress;
import com.niit.service.BillingAddressService;

@Controller
public class BillingAddressController {
	
	
	@Autowired
	private BillingAddressService billingAddressService;
	
@RequestMapping("/billingAddress")
public String billingAddress(Model model){
	return "billingAddress";
}

@RequestMapping(value = "/insertbillingAddress", method = RequestMethod.POST)
public String addNewinsertBillingAddress(@ModelAttribute("addbillingAddress")BillingAddress billingAddress, Model model){
	billingAddressService.addBillingAddress(billingAddress);
	return "shippingAddress";
	
}

}
