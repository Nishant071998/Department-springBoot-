package com.example.demo.controller;

import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;

import com.example.demo.service.Departmentservice;

@RestController
public class DepartmentController {
	@Autowired
	private Departmentservice departmentservice;
	@PostMapping("/department")
public Department saveDepartment(@RequestBody Department department )
{ 
		return departmentservice.saveDepartment(department);
}
	@GetMapping("/departments")
	public List<Department>  fetch()
	{
		return departmentservice.fetch();
	}
	@GetMapping("/departments/{id}")
	public Department fetchByid(@PathVariable("id") long Id)
	{
		return departmentservice.fetchByid(Id);
		
	}
	@DeleteMapping("/departments/{id}")
	public List<Department>  deleteDepartmentByid(@PathVariable("id")long id)
	{
	   departmentservice.deleteDepartmentByid(id);
	   return departmentservice.fetch();
	}
	@PutMapping("/departments/{id}")
	public Department updatedepartment(@PathVariable("id") long id ,@RequestBody Department department)
	{
		return departmentservice.udpatedepartment(id,department);
	}
	@GetMapping("/departments/name/{name}")
	public Department Findbyname(@PathVariable("name") String department_name)
	{
		return departmentservice.fetchbyname(department_name);
	}
}
