package com.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 4, 5, 67, 89, 88);
		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		System.out.println("Print even numbers");
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		System.out.println("Print odd numbers");
		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println); // print odd numbers
		System.out.println("Print even number using method reference");
		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
		System.out.println("Predicate Not to print odd numbers");
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}

}
