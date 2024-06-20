package com.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portal.user.entity.Users;
import com.portal.user.service.UserService;
import com.portal.user.service.UserServiceImpl;

@Controller
public class WebController {

	@RequestMapping("/usersdata")
	public String home()
	
	{
		System.out.print("this is home");
		return "UsersData";
	}
	@RequestMapping("/index")
	public String index()
	{
	
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
	
		return "login";
	}
	@RequestMapping("/signup")
	public String signup(Users user)
	{
		UserServiceImpl service;
		return "signup";
	}
	@RequestMapping("/jobs")
	public String jobs()
	{
	
		return "jobs";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
	
		return "welcome";
	}
}
