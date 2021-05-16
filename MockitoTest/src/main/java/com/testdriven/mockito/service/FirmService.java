package com.testdriven.mockito.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testdriven.mockito.model.Firm;
import com.testdriven.mockito.repository.FirmRepository;

@Service
public class FirmService {
	@Autowired
	EmployeeService empservice;

	private FirmRepository repository;

	String getFirmName(String firmId) {
		return "IBM";
	}

	List<String> getFirmEmployeeList(String firmId) {
		return empservice.getEmployeeList(firmId);
	}

	public List<Firm> findAll() {
		List<Firm> firmList = new ArrayList<Firm>();
		Iterable<Firm> list = repository.findAll();
		for (Firm firm : list) {
			firmList.add(firm);
		}
		return firmList;
	}
}
