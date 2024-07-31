package com.arjun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arjun.entity.Student;
import com.arjun.repo.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public String upsert(Student student){
		
		 studentRepository.save(student);
		
		return "success";
	}

	@Override
	public Student getById(Integer stuId) {
		
		Optional<Student> findById = studentRepository.findById(stuId);
		if(findById.isPresent()) {
			
			findById.get();
		
	    }
		
		return null;
	}

	@Override
	public List<Student> getAll() {
		studentRepository.findAll();
		return null;
	}

	@Override
	public String deleteById(Integer stuId) {
	    if(studentRepository.existsById(stuId)){
		studentRepository.deleteById(stuId);
		
		return "Deleted";
	    }
		return "record not found";
	}

}
