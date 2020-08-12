/*
 * package com.merlinsoftech;
 * 
 * import java.util.List;
 * 
 * import org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.merlinsoftech.model.Employee; import
 * com.merlinsoftech.model.Employees;
 * 
 * public class ConsumerSample {
 * 
 * public static void main(String[] args) { RestTemplate restTemplate = new
 * RestTemplate();
 * 
 * //used for pathvariables // ResponseEntity<Employee> responseEntity =
 * restTemplate.exchange("http://localhost:9000/find1?eno=1",
 * HttpMethod.GET,null, Employee.class, "1"); // responseEntity.getStatusCode();
 * // System.out.println(responseEntity);
 * 
 * //put method // Employee employee = new Employee(2, "bharath", 500d); //
 * restTemplate.put("http://localhost:9000/insert", employee);
 * 
 * Employees employees = restTemplate.getForObject("http://localhost:9000/find",
 * Employees.class);
 * 
 * //retrive all records List<Employee> employee = employees.getEmployee(); for
 * (Employee employee2 : employee) { System.out.println(employee2); } } }
 */