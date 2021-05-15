package com.testdriven.math.service;

public class MathService {

	public Integer sum(int firstNumber, int secondNumber) {

		return firstNumber + secondNumber;
	}

	public Integer divide(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			throw new IllegalArgumentException("SecondNumber must not be 0");
		} else {
			return firstNumber % secondNumber;
		}
	}

	public Integer multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public Boolean isEven(int number) {
		return number % 2 == 0;
	}

	public Boolean isOdd(int number) {
		return number % 2 != 0;
	}

}
