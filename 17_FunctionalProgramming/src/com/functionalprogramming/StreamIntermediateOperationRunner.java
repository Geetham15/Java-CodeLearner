package com.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class StreamIntermediateOperationRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(3, 5, 8, 213, 45, 4, 7);
		numbers.stream().forEach(e -> System.out.println(e));

		// sorted numbers
		numbers.stream().sorted().forEach(e -> System.out.println(e));

		// distinct sorted number
		List<Integer> duplicateNumList = List.of(3, 5, 8, 3, 5, 213, 7, 45, 4, 7);
		duplicateNumList.stream().distinct().sorted().forEach(e -> System.out.println(e));

		// square of distinct numbers
		duplicateNumList.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));

		List<Integer> nums = List.of(4, 6, 8, 13, 3, 15);
		// Print squares of first 10 numbers!
		// Clue - IntStream.range(1,10)
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		// List.of("Apple", "Ant", "Bat").stream()
		// Map all of these to lowercase and print them

		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		// List.of("Apple", "Ant", "Bat").stream()
		// Print the length of each element
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

}
