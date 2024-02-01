package com.testingproject.usersservice.entity;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID, generator = "system-uuid")
	@Column(name = "student_id", unique = true)
	private UUID studentId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("user_id")
	@JoinColumn(name = "user_id")
	private User user;

	public Student() {
		super();
	}
	
	public Student(User user) {
		this.user = user;
	}
	
	public Student(UUID studentId, User user) {
		super();
		this.studentId = studentId;
		this.user = user;
	}

	
	public UUID getStudentId() {
		return studentId;
	}

	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Student: {studentId=" + studentId + ", user=" + user + "}";
	}
}
