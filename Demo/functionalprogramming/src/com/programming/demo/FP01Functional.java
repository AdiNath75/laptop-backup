package com.programming.demo;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 12, 15);
		// printAllNumbersInListFunctional(numbers);
		// printEvenNumbersInListFunctional(numbers);
		printSquaresofEvenNumbersInListFunctional(numbers);

	}

	private static void printSquaresofEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 == 0)
		// mapping
		.map(number -> number * number)
		.forEach(System.out::println);
	
	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven)
				// lambda exp
				.filter(number -> number % 2 == 0).forEach(System.out::println);

	}

//	private static void print(int number) {
//		System.out.println(number);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// numbers.stream().forEach(FP01Functional::print);
	}

}
