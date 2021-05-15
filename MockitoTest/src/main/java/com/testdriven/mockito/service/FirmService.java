package com.testdriven.mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirmService {
	@Autowired
	EmployeeService empservice;

	String getFirmName(String firmId) {
		return "IBM";
	}

	List<String> getFirmEmployeeList(String firmId) {
		return empservice.getEmployeeList(firmId);
	}
}
