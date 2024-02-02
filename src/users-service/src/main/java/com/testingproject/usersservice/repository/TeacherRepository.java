package com.testingproject.usersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.testingproject.usersservice.entity.Teacher;
import com.testingproject.usersservice.entity.User;

@Repository
@Component
public interface TeacherRepository extends JpaRepository<Teacher, String> {

	public Teacher findByUser(User user);
}
