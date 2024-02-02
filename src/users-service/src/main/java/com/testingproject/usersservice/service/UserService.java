package com.testingproject.usersservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import com.testingproject.usersservice.entity.User;
import com.testingproject.usersservice.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User registerUser(String username, String email, String password)
			throws DataIntegrityViolationException, IllegalArgumentException {
		User user = new User(username, email, password);
		return userRepository.saveAndFlush(user);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User setPassword(User user, String password) {
		user.setPassword(password);
		return userRepository.save(user);
	}

	public User setEmail(User user, String email) {
		user.setEmail(email);
		return userRepository.save(user);
	}

	public User setUsername(User user, String username) {
		user.setUsername(username);
		return userRepository.save(user);
	}

	public User setDeactivated(User user, boolean deactivated) {
		user.setDeactivated(deactivated);
		return userRepository.save(user);
	}
}
