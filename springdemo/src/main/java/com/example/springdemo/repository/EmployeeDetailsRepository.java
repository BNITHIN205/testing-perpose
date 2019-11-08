package com.example.springdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springdemo.model.EmployeeDetailsT;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetailsT, Integer>{

	EmployeeDetailsT findByGender(String gender);
	@Query(value="select ET from EmployeeDetailsT ET ")
	List<EmployeeDetailsT> getAllEmployees();
}
