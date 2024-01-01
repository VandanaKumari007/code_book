package com.spring.service;

import com.spring.dto.Response;
import com.spring.model.EmployeeModel;

public interface EmployeeService {

	Response<EmployeeModel> createRecord(EmployeeModel emp);

}
