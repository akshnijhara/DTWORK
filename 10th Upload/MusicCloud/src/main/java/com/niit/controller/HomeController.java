package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String Login(
	@RequestParam(value="error", required = false)
	String error,
	@RequestParam(value="logout", required = false)
	String logout,
	Model model){
	if(error != null){
	model.addAttribute("error", "Invalid username and password");
	}
	if (logout !=null){
	model.addAttribute("msg", "You have been logged out successfully");
	}
	return "Login";
	}
}
