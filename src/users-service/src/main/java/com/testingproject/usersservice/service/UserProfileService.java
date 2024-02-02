package com.testingproject.usersservice.service;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.testingproject.usersservice.entity.User;
import com.testingproject.usersservice.entity.UserProfile;
import com.testingproject.usersservice.repository.UserProfileRepository;

@Component
public class UserProfileService {

	private UserProfileRepository userProfileRepository;
	
	public UserProfile registerUserProfile(User user, String firstName, String lastName) {
		UserProfile userProfile = new UserProfile(user, firstName, lastName);
		return userProfileRepository.saveAndFlush(userProfile);	
	}
	
	public UserProfile findByUser(User user) {
		return userProfileRepository.findByUser(user);
	}
	
	public UserProfile setFirstName(UserProfile userProfile, String firstName) {
		userProfile.setFirstName(firstName);
		return userProfileRepository.save(userProfile);
	}
	
	public UserProfile setLastName(UserProfile userProfile, String lastName) {
		userProfile.setFirstName(lastName);
		return userProfileRepository.save(userProfile);
	}
	
	public UserProfile setCountryCode(UserProfile userProfile, String countryCode) {
		userProfile.setCountryCode(countryCode);
		return userProfileRepository.save(userProfile); 
	}
	
	public UserProfile setLocalityCode(UserProfile userProfile, String localityCode) {
		userProfile.setLocalityCode(localityCode);
		return userProfileRepository.save(userProfile);
	}
	
	public UserProfile setProfilePicture(UserProfile userProfile, String profilePicture) {
		userProfile.setProfilePicture(profilePicture);
		return userProfileRepository.save(userProfile);
	}
	
	public UserProfile setBirthdate(UserProfile userProfile, Date birthdate) {
		userProfile.setBirthdate(birthdate);
		return userProfileRepository.save(userProfile);
	}
} 
