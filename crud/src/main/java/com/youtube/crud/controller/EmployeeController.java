package com.youtube.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.crud.dao.EmployeeDao;
import com.youtube.crud.entity.Employee;
import com.youtube.crud.service.EmployeeService;

//controller class 
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// doing crud operation in springboot
	// create new employee.
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

// get employee
	@GetMapping("/get/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();

	}

	// get employee by id
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId) {
		return employeeService.getEmployeeById(employeeId);

	}
	// delete employee

	@DeleteMapping("/delete/employee/{employeeId}")
	public void deleteEmployee(@PathVariable Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}

	// updating employee record
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

}
