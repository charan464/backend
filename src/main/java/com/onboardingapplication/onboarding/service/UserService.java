package com.onboardingapplication.onboarding.service;



import com.onboardingapplication.onboarding.model.User;

public interface UserService {
	
	public User signUser(User user);
	
	public User findUser(String email);

}
