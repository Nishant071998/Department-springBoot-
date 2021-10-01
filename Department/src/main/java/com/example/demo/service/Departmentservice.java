package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface Departmentservice {


	
	Department saveDepartment(Department department);
	List<Department> fetch();
	Department fetchByid(long id);
	void deleteDepartmentByid(long id);
	Department udpatedepartment(long id, Department department);
    Department fetchbyname(String department_name);
	
	

}
