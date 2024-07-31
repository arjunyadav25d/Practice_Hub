package com.arjun.service;

import java.util.List;

import com.arjun.entity.Student;

public interface StudentService {

	
	public String upsert(Student student);
	
	public Student getById(Integer stuId);
	
	public List<Student> getAll();
	
	public String deleteById(Integer stuId);
	
	
}
