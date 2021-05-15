package com.testdriven.mockito.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testdriven.mockito.constants.MockitoConstants;

@Service
public class EmployeeService {
	List<String> getEmployeeList(String firmId) {
		return MockitoConstants.FIRM_MAP.get(firmId);
	}
}
