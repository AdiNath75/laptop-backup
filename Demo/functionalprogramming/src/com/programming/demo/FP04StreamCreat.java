package com.programming.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP04StreamCreat {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCreateStream(numbers);
		
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count();
		
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum);
		
		Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int[] array =  {12, 9, 13, 4, 6, 2, 4, 12, 15};
		
		System.out.println(Arrays.stream(array));
		
		Arrays.stream(array).sum();
		
		
		// 
		System.out.println(IntStream.range(1,10));
		
		System.out.println(IntStream.range(1,10).sum());
		
		System.out.println(IntStream.rangeClosed(1,10).sum());
		
		System.out.println(IntStream.iterate(1,e -> e + 2).limit(10).sum());
		
		IntStream.iterate(1,e -> e + 2).limit(10).peek(System.out::println).sum();
		
	}

	private static void printCreateStream(List<Integer> numbers) {
		System.out.println(numbers.stream());
		
	}

}
