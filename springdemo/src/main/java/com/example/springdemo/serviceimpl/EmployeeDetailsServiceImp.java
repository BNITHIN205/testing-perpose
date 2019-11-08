package com.example.springdemo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.EmployeeDetailsT;
import com.example.springdemo.repository.EmployeeDetailsRepository;
import com.example.springdemo.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImp implements EmployeeDetailsService {

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	
	@Override
	public Optional<EmployeeDetailsT> getEmployee(int id) {
		// TODO Auto-generated method stub
		return  employeeDetailsRepository.findById(id);
	}

	@Override
	public EmployeeDetailsT saveEmployeeDetails(EmployeeDetailsT employeeDetailsT) {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.save(employeeDetailsT);
	}

	@Override
	public List<EmployeeDetailsT> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.findAll();
	}
	
	@Override
	public EmployeeDetailsT getEmployeeByGender(String gender) {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.findByGender(gender);
	}

}
