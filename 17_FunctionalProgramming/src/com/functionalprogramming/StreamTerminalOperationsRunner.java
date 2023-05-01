package com.functionalprogramming;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminalOperationsRunner {
	public static void main(String[] args) {
		// Terminal function - Take a stream of numbers and returns a one number
		List<Integer> nums = List.of(4, 6, 8, 13, 3, 15);
		// Get the sum of the list
		int sum = IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);
		// Get maximum number
		int maxnum = List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println("Maximum number in the list : " + maxnum);
		// Get minimum number
		int minnum = List.of(23, 12, 34, 53).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println("Maximum number in the list : " + minnum);
		// Get odd number
		List<Integer> oddnumList = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1)
				.collect(Collectors.toList());
		System.out.println(oddnumList);
		// Get even number list
		List<Integer> evennumList = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evennumList);

		// print of square number for first 10 integers
		List<Integer> squareList = IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println(squareList);
	}
}
