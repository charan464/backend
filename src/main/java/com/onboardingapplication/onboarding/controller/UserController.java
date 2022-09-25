package com.onboardingapplication.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboardingapplication.onboarding.model.User;
import com.onboardingapplication.onboarding.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/")
	public String main()
	{
		return "hello world";
	}
	
	@PostMapping("/login")
	public User	signUser(@RequestBody User user)
	{
		return  userService.signUser(user);
	}
	
	@GetMapping("/login/{email}/{password}")
	public User getUsers(@PathVariable("email") String email , @PathVariable("password") String password )
	{
		User u = userService.findUser(email);
		
		System.out.println(u.getEmail()+" "+u.getPassword());
		
		if(u==null||!u.getPassword().equals(password))
		{
			throw new RuntimeException("error");
			
		}
		
		return u;
	}
	
	

}
