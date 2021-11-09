package com.nikhil.sportyshoes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nikhil.sportyshoes.model.User;
import com.nikhil.sportyshoes.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public String loginPage()
	{
		System.out.println("login page");
		return "login";
	}
	
	@PostMapping
	public String loginRedirect(@RequestParam("username") String email) throws UsernameNotFoundException
	{	
		System.out.println("post login");
		Optional<User> user = service.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+email));
		if(user.get().getRoles() == "ADMIN")
			return "admindashboard";
		return "/";
	}
}
