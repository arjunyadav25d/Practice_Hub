package com.arjun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Student_Table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stuId;
	
	private String stuName;
	
	private String collageName;
	
	private Double stuFees;
	
	
}
