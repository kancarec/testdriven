package com.testdriven.math.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathServiceTest {

	MathService mathservice;

	@BeforeEach
	void init() {
		mathservice = new MathService();
	}

	@Test
	void testSum() {
		int result = mathservice.sum(15, 5);
		assertEquals(20, result);
	}

	@Test
	void testDivideWithException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> mathservice.divide(5, 0));
	}

	@ParameterizedTest
	@CsvSource(value = { "2,6", "3,9", "4,12" })
	void testMultiply(Integer number, Integer result) {
		Integer mul = mathservice.multiply(number, 3);
		assertEquals(result, mul);
	}



}
