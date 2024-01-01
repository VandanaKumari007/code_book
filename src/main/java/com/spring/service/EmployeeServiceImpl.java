package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDao;
import com.spring.dto.Response;
import com.spring.model.EmployeeModel;
import com.spring.util.Constants;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Response<EmployeeModel> createRecord(EmployeeModel emp) {
		Response<EmployeeModel> response = new Response<>();
		long time = System.currentTimeMillis();
		System.out.println("getting name is "+emp.getName());
		String uniqueId = emp.getName().substring(0,2) + String.valueOf(time);
		System.out.println("my unique id is "+uniqueId);
		emp.setEid(uniqueId);
		EmployeeModel empDetails = employeeDao.save(emp);
		response.setStatus(Constants.SUCCESS_CODE);
		response.setMessage(Constants.DETAILS_CREATED_MESSAGE);
		response.setData(empDetails);
		System.out.println("some changes....");
		return response;
		
	}

}
