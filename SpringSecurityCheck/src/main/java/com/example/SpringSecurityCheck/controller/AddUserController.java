package com.example.SpringSecurityCheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityCheck.model.User;
import com.example.SpringSecurityCheck.service.UserService;

@RestController
@RequestMapping("/secure/auth/")
public class AddUserController {

	@Autowired
	private UserService userService;

	@GetMapping
	@RequestMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.saveUserDetails(user);
	}

}
