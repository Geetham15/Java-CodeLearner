package com.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer i) {
		System.out.println(i);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(e -> System.out.println(e));

		List.of("ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		// Method References
		List.of("ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		List.of("ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> MethodReferencesRunner.print(s));

		Integer max = List.of(23, 45, 67, 12).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);

		System.out.println(max);

	}



}
