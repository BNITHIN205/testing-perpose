package com.example.springdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.EmployeeDetailsT;
import com.example.springdemo.repository.EmployeeDetailsRepository;
import com.example.springdemo.service.EmployeeDetailsService;

@CrossOrigin
@RestController
@RequestMapping(value = { "/employee" })
public class Springcontroller {

	@Autowired
	EmployeeDetailsService employeeDetailsService;

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<EmployeeDetailsT> getemployee(@PathVariable("id") int id) {
		Optional<EmployeeDetailsT> detailsT = employeeDetailsService.getEmployee(id);
		System.out.println(detailsT);
		return detailsT;
	}

	@PostMapping(value = "/saveEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetailsT saveEmployeeDetails(@RequestBody EmployeeDetailsT employeeDetailsT) {
		
		System.out.println(employeeDetailsT);
		//return null;
		return employeeDetailsService.saveEmployeeDetails(employeeDetailsT);
	}

	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeDetailsT> getAllemployees() {
		List<EmployeeDetailsT> detailsTs = employeeDetailsService.getAllEmployeeDetails();
		return detailsTs;
	}

	@GetMapping(value = "/getgender", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetailsT getByGender() {
		EmployeeDetailsT detailsTs = employeeDetailsService.getEmployeeByGender("F");
		System.out.println(detailsTs.toString());
		return detailsTs;
	}

}
