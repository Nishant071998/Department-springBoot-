package com.example.demo.repositry;

import org.springframework.stereotype.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Department;

@Repository
public interface Departmentrepositry extends JpaRepository<Department,Long> {

@Query(value="select department_name from Department where department_name=?1")
 public Department findBydepartment_name(String department_name);
@Query(value="select department_name from Department where UPPER(department_name) = UPPER(?1)")
public Department findByFirstnameIgnoreCase(String department_name);

 

}
