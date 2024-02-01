package com.testingproject.usersservice.entity;

import java.util.Collection;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID, generator = "system-uuid")
	@Column(name = "teacher_id", unique = true)
	private UUID teacherId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("user_id")
	@JoinColumn(name = "user_id")
	private User user;

	public Teacher() {
		super();
	}
	
	public Teacher(User user) {
		this.user = user;
	}
	
	public Teacher(UUID teacherId, User user) {
		super();
		this.teacherId = teacherId;
		this.user = user;
	}

	
	public UUID getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(UUID teacherId) {
		this.teacherId = teacherId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Student: {teacherId=" + teacherId + ", user=" + user + "}";
	}
	
	@OneToMany(mappedBy = "teacher")
	private Collection<TeacherLanguage> teacherLanguages;

	public Collection<TeacherLanguage> getTeacherLanguages() {
		return teacherLanguages;
	}

	public void setTeacherLanguages(Collection<TeacherLanguage> teacherLanguages) {
		this.teacherLanguages = teacherLanguages;
	}
}
