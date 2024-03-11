package com.programming.demo;

import java.util.List;

public class FP01Structural {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 12, 15);
		// printAllNumbersInListFunctional(numbers);
		printAllEvenNumbersInListFunctional(numbers);

	}

	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		for (int number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// how to loop numbers
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
