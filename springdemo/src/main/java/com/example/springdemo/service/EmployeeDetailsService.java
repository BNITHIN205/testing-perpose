package com.example.springdemo.service;

import java.util.List;
import java.util.Optional;

import com.example.springdemo.model.EmployeeDetailsT;

public interface EmployeeDetailsService {
	
	public Optional<EmployeeDetailsT> getEmployee(int id);
	public EmployeeDetailsT saveEmployeeDetails(EmployeeDetailsT employeeDetailsT);
	public List<EmployeeDetailsT> getAllEmployeeDetails();
	public EmployeeDetailsT getEmployeeByGender(String gender);

}
