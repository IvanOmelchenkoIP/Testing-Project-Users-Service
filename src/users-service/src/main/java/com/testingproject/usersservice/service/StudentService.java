package com.testingproject.usersservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testingproject.usersservice.entity.Student;
import com.testingproject.usersservice.entity.User;
import com.testingproject.usersservice.repository.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student registerTeacher(User user) {
		Student student = new Student(user);
		return studentRepository.saveAndFlush(student);
	}
	
	public Student findByUser(User user) {
		return studentRepository.findByUser(user);
	}
}
