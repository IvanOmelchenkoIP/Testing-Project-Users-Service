package com.testingproject.usersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.testingproject.usersservice.entity.User;
import com.testingproject.usersservice.entity.UserProfile;

@Repository
@Component
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {

	public UserProfile findByUser(User user);
}
