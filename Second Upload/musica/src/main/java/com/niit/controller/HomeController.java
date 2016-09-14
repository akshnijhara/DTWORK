package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	
	}
	@RequestMapping("/AboutUs")
	public String aboutUs()
	{
		return "AboutUs";
	}
	@RequestMapping("/AllProducts")
	public String allproducts()
	{
		return "AllProducts";
	
	}

	
@RequestMapping("/index")
public String index()
{
	return "index";

}	
@RequestMapping("/ContactUs")
public String ContactUS()
{
	return "ContactUs";

}
@RequestMapping("/Register")
public String Register()
{
	return "Register";

}
@RequestMapping("/Login")
public String Login()
{
	return "Login";

}
}