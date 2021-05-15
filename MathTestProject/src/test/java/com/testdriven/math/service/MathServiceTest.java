package com.testdriven.math.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6 })
	void testIsOdd(Integer number) {
		Boolean result = mathservice.isOdd(number);
		System.out.println(number);
		assertFalse(result);
	}

	@ParameterizedTest
	@MethodSource("produceEvenNumber")
	void testIsEven(Integer number) {
		Boolean result = mathservice.isEven(number);
		System.out.println(number);
		assertTrue(result);
	}


	static List<Integer> produceEvenNumber() {
		List<Integer> numberList = new ArrayList<Integer>();
		for (int i = 1; i < 6; i++) {
			numberList.add(i * 2);
		}
		return numberList;
	}




}
