package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repositry.Departmentrepositry;

@Service
public class DepartmentServiceImp implements Departmentservice{
    @Autowired
	private Departmentrepositry deprepo;

	@Override
	public List<Department> fetch() {
		// TODO Auto-generated method stub
		return deprepo.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		
		return deprepo.save(department);
	}

	@Override
	public Department fetchByid(long id) {
		
		return deprepo.findById(id).get();
	}

	@Override
	public void deleteDepartmentByid(long id) {
		// TODO Auto-generated method stub
		deprepo.deleteById(id);;
		
	}

	@Override
	public Department udpatedepartment(long id, Department department) {
		// TODO Auto-generated method stub
		Department obj=deprepo.findById(id).get();
		if(Objects.nonNull(department.getDepartment_name())&& (!"".equalsIgnoreCase(department.getDepartment_name())))
		{
			obj.setDepartment_name(department.getDepartment_name());
		}
		return deprepo.save(obj);
	}

	@Override
	public Department fetchbyname(String department_name) {
		// TODO Auto-generated method stub
		return deprepo.findByFirstnameIgnoreCase(department_name);
	}

	
   
}
