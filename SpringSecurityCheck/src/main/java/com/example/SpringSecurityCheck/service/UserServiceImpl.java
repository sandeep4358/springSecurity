package com.example.SpringSecurityCheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityCheck.model.User;
import com.example.SpringSecurityCheck.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	public User saveUserDetails(User user) {
		user.setUserPassword(encoder.encode(user.getUserPassword()));
		return userRepository.save(user);
	}

}
