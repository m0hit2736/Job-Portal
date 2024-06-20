package com.portal.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.user.entity.Users;
import com.portal.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	
	@PostMapping("/add/user")
	Users addUser(@RequestBody Users use)
	{
		return service.addUser(use);
	}
	

}
