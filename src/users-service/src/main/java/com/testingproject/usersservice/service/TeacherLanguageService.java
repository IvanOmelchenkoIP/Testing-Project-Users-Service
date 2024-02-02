package com.testingproject.usersservice.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testingproject.usersservice.entity.Teacher;
import com.testingproject.usersservice.entity.TeacherLanguage;
import com.testingproject.usersservice.repository.TeacherLanguageRepository;

@Component
public class TeacherLanguageService {

	@Autowired
	private TeacherLanguageRepository teacherLanguageRepository;
	
	public TeacherLanguage registerTeacherLanguage(Teacher teacher, String languageCode) {
		TeacherLanguage teacherLanguage = new TeacherLanguage(teacher, languageCode);
		return teacherLanguageRepository.saveAndFlush(teacherLanguage);
	}
	
	public Collection<TeacherLanguage> findByTeacher(Teacher teacher) {
		return teacherLanguageRepository.findByTeacher(teacher);
	}
}
