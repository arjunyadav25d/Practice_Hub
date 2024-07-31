package com.arjun.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arjun.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
