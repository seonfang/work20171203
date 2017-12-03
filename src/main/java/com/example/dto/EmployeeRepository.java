package com.example.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	
	//查询
	List<Employee> findByEid(int eid);
	//修改
	//int saveAndFlush(Employee);
	
	
}
