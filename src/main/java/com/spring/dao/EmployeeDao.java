package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.EmployeeModel;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeModel, String> {

}
