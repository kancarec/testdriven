package com.testdriven.mockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.testdriven.mockito.model.Firm;
import com.testdriven.mockito.repository.FirmRepository;

@ExtendWith(MockitoExtension.class)
public class TestFirmService {
	@Mock
	EmployeeService empservice;

	@Mock
	private FirmRepository repository;

	@InjectMocks
	FirmService service;

	@Test
	void testGetEmployeeList() {
		List<String> testList = Arrays.asList("A", "B", "C");
		Mockito.when(empservice.getEmployeeList(any())).thenReturn(testList);
		List<String> employeeList = service.getFirmEmployeeList("2");
		assertNotNull(employeeList);
		assertEquals(3, employeeList.size());

	}

	@Test
	void testGetFirmName() {
		String firmName = service.getFirmName("2");
		assertEquals("IBM", firmName);
	}

	@Test
	void testFindAll() {
		Firm firstFirm = new Firm("IBM", "IT");
		Firm secondFirm = new Firm("RTA", "COM");
		doReturn(Arrays.asList(firstFirm, secondFirm)).when(repository).findAll();
		List<Firm> firmList = service.findAll();
		assertEquals(2, firmList.size());
	}

}
