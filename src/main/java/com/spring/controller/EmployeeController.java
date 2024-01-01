	package com.spring.controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.spring.dto.Response;
	import com.spring.model.EmployeeModel;
	import com.spring.service.EmployeeService;
	
	@RestController
	@RequestMapping(value = "/emp")
	public class EmployeeController {
	
		@Autowired
		EmployeeService employeeService;
	
		@PostMapping(value = "create-record")
		public ResponseEntity<?> createRecord(@RequestBody EmployeeModel emp) {
			System.out.println("Inside :: createRecord "+emp);
		Response<EmployeeModel>	response = employeeService.createRecord(emp);
			return ResponseEntity.ok(response);
	
		}
	
	}
