package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.dto.EmployeeRepository;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpklApplicationTests {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	Employee employee;
	@Test
	public void contextLoads() {
		
//		employeeService.findEmployee();
		//repository.save(new Customer("Jack", "Bauer"));
		//查询
		System.out.println("根据ID查找："+employeeRepository.findByEid(1));
		System.out.println("findAll："+employeeRepository.findAll());
		System.out.println("findOne:"+employeeRepository.findOne( 2));
		//增加
 		employeeService.insertEmployee();
 		System.out.println("findAll："+employeeRepository.findAll());
 		//删除
		employeeService.deleteEmployee();
		
 		//修改
		employeeService.updEmployee();
		System.out.println("findAll："+employeeRepository.findAll());
	}

	
	
}
