package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/index"})
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/AboutUs")
	public String aboutUs()
	{
		return "AboutUs";
	}
	@RequestMapping("/ContactUs")
	public String ContactUs()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/Privacy")
	public String Privacy()
	{
		return "Privacy";
	}
	@RequestMapping("/AllProducts")
	public String AllProducts()
	{
		return "AllProducts";
	}
	@RequestMapping("/Login")
	public String Login()
	{
		return "Login";
	}
}
