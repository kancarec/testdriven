package com.testdriven.mockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestFirmService {
	@Mock
	EmployeeService empservice;
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

}
