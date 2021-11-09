package com.nikhil.sportyshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "User";
	}
	
	@GetMapping("/admindashboard")
	public String admin()
	{
		return "admindashboard";
	}
}
