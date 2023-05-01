package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat");
		List<Integer> numbers = List.of(1, 4, 7, 9);
		printBasic(list);
		printWithFP(list);
		printBasicWithFiltering(list);
		printFPWithFiltering(list);
		printFPWithOddNumbers(numbers);
		printFPWithEvenNumbers(numbers);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}

	private static void printFPWithOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 1)
				.forEach(element -> System.out.println("Odd element - " + element));
	}

	private static void printFPWithEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even element - " + element));
	}
}
