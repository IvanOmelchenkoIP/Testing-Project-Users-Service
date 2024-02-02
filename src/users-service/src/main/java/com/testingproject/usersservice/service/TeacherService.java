package com.testingproject.usersservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testingproject.usersservice.entity.Teacher;
import com.testingproject.usersservice.entity.User;
import com.testingproject.usersservice.repository.TeacherRepository;

@Component
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public Teacher registerTeacher(User user) {
		Teacher teacher = new Teacher(user);
		return teacherRepository.saveAndFlush(teacher);
	}
	
	public Teacher findByUser(User user) {
		return teacherRepository.findByUser(user);
	}
}
