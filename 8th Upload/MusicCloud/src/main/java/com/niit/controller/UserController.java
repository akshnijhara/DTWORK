package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Users;
import com.niit.service.UsersService;

@Controller
public class UserController {
	
	
	@Autowired
	private UsersService usersService;

	@RequestMapping("/Login")
	public String login() {
		return "Login";
	}

	@RequestMapping("/Register")
	public String Register(Model model) {
		/*List allUsers = usersService.getAllUsers();

		model.addAttribute("addUsers", allUsers);*/
		return "Register";
	}

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public String insertNewUser(@ModelAttribute("addUsers") Users users, Model model) {
		usersService.addUsers(users);
		return "login";
	}
}
