package com.programming.demo;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCubesOfOddNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		// courses.stream()
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.contains("Spring"))
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.length() >= 4)
		// .forEach(System.out::println);
		
		courses.stream()
			.map(course -> course + " " + course.length()) 
			.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.map (number -> number * number * number)
				.forEach(System.out::println);// Method Reference
	}
	
	// sort ascending
	// courses.stream().sorted().forEach(System.out::println);
	
	// courese.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)

	// reverse order
	// courese.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)

	// compare by length and sort
	// courese.stream().sorted(Comparator.compairing(str -> str.length).forEach(System.out::println)

	// length of course
	// courses.stream().map(x -> x.length()).collect(Collectors.toList())
	
}