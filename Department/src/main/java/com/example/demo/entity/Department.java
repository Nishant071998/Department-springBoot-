package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="departmentID")
	long departmentID;
	@Column(name="department_name")
	String department_name;
	
public long getDepartmentID() {
	return departmentID;
}
public void setDepartmentID(long departmentID) {
	this.departmentID = departmentID;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}

public Department(long departmentID, String department_name) {
	this.departmentID = departmentID;
	this.department_name = department_name;
}
@Override
public String toString() {
	return "Department [departmentID=" + departmentID + ", department_name=" + department_name + "]";
}
public Department() {
	
}
public Department(String department_name) {
	
	this.department_name = department_name;
	
}


 
}
