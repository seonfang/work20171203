package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.EmployeeRepository;
import com.example.entity.Employee;

@Service
@Transactional
public class EmployeeService {

	@PersistenceContext
	 EntityManager em;
	@Autowired
	Employee employee;
	@Autowired
	EmployeeRepository employeeRepository;
	/**
	 * 查询
	 * @return
	 */
	public List<Employee> findEmployee() {
		return em.createNamedQuery("Employee.findAll",
				 Employee.class).getResultList();
	
		 }
	/**
	 * 增加
	 */
	public void insertEmployee() {
		employee.setEid(1203);
		employee.setEname("zhoumo");
		employee.setSalary(777.77);
		employee.setDeg("今天周日");
		employeeRepository.save(employee);
	}
	
	/**
	 * 修改
	 */
	public void updEmployee() {
		employee.setEid(123);
		employee.setSalary(888.88);
		employeeRepository.saveAndFlush(employee);
	}
	/**
	 * 删除
	 * 删除单条,根据主键值
	 */
	public void deleteEmployee() {
		
		employeeRepository.delete(123);
	}
}
