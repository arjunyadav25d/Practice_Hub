package com.arjun.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjun.entity.Student;
import com.arjun.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student student){
		
		String upsert = studentService.upsert(student);
		 
		return new ResponseEntity<String>(upsert, HttpStatus.CREATED);
	}

	@GetMapping("/get/{stuId}")
	public ResponseEntity<Student> getStudentById(@PathVariable("stuId") Integer stuId){
		
		Student byId = studentService.getById(stuId);
		return new ResponseEntity<Student>(byId, HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		List<Student> all = studentService.getAll();
		
		return new ResponseEntity<List<Student>>(all, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		
		String upsert = studentService.upsert(student);
		return new ResponseEntity<>(upsert, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudentById(@PathVariable Integer stuId){
		
		String deleteById = studentService.deleteById(stuId);
		return new ResponseEntity<String>(deleteById, HttpStatus.OK);
		
	}
}
