package com.merlinsoftech.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.merlinsoftech.model.Employee;
import com.merlinsoftech.model.Employees;

@RestController
public class EmployeeController {

	@GetMapping(path = "/find")
	public Employees findAll() {
		Employee employee = new Employee(1, "abc", 100d);
		Employee employee2 = new Employee(2, "Def", 200d);
		Employee employee3 = new Employee(3, "ghi", 300d);
		
		List<Employee> list = Arrays.asList(employee,employee2,employee3);
		
		Employees employees = new Employees();
		employees.setEmployee(list);
		
		return employees;
	}
	
	@GetMapping(path = "/find/{eno}")
	public Employee findById(@PathVariable("eno") Integer eno) {
		return new Employee(eno, "abc", 100d);
	}
	
	@GetMapping(path = "/find1")
	public Employee findByIdRequestParam(@RequestParam("eno") Integer eno) {
		return new Employee(eno, "abc", 100d);
	}
	
	@PostMapping(path = "/insert")
	public ResponseEntity<Employee> insert(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
	}
	
}
