package com.testingproject.usersservice.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.testingproject.usersservice.entity.Teacher;
import com.testingproject.usersservice.entity.TeacherLanguage;

@Repository
@Component
public interface TeacherLanguageRepository  extends JpaRepository<TeacherLanguage, String> {

	public Collection<TeacherLanguage> findByTeacher(Teacher teacher);
}
