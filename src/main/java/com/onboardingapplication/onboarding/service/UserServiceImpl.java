package com.onboardingapplication.onboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onboardingapplication.onboarding.dao.UserDao;
import com.onboardingapplication.onboarding.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User signUser(User user) {
		
		userDao.save(user);
		
		return user;
		
	}


	@Override
	public User findUser(String email) {
		
		return userDao.findByEmail(email);
	}



}
