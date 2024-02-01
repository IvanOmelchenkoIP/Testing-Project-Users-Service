package com.testingproject.usersservice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "TeacherLanguages")
public class TeacherLanguage {
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("teacher_id")
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;
	
	@Column(name = "language_code")
	private String languageCode;

	public TeacherLanguage() {
		super();
	}
	
	public TeacherLanguage(Teacher teacher, String languageCode) {
		super();
		this.teacher = teacher;
		this.languageCode = languageCode;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		return "TeacherLanguage: {teacher=" + teacher + ", languageCode=" + languageCode + "}";
	}
}
