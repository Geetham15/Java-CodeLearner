package com.functionalprogramming;

import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		System.out
				.println(List.of(23, 45, 67).stream().filter(n -> n % 2 == 0)
						.max((n1, n2) -> Integer.compare(n1, n2))); // Optional.empty

		System.out.println(
				List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))); // Optional[12]
		Optional<Integer> num = List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(num.get()); // 12
		System.out.println(num.isPresent()); // true
		System.out.println(num.orElse(0)); // 12 or returns 0 if the number not exists
	}

}
