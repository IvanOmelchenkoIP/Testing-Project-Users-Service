package com.testingproject.usersservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.testingproject.usersservice.entity.Student;
import com.testingproject.usersservice.entity.User;

@Repository
@Component
public interface StudentRepository extends JpaRepository<Student, String> {

	public Student findByUser(User user);
}
