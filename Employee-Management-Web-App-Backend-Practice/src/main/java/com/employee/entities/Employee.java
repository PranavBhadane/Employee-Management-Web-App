package com.employee.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "employee2")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "emp_id")
	public int empID;
	
	@Column (name = "emp_name")
	public String empName;
	
	@Column (name = "designation")
	public String designation;
	
	@Column (name = "emp_sal")
	public double empSal;
	
	
}
