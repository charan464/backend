package com.onboardingapplication.onboarding.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onboardingapplication.onboarding.model.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
