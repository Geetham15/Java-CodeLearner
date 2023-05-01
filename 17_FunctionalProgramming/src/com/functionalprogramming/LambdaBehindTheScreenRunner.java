package com.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);

	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {

		return t * t;
	}

}
public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {
		// 1. Storing functions in variables
		// 2. Passing functions to methods
		// 3. Returning functions from methods

		List.of(23, 43, 34, 24, 45).stream().filter(createEvenPredicate()).forEach(e -> System.out.println(e)); // get
																												// even
																											// number

		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;
		List.of(23, 43, 34, 24, 45).stream().filter(evenPredicate).forEach(e -> System.out.println(e)); // get even
		// number
		// Predicate = evaluates the method true or false
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t)
		List.of(23, 43, 34, 24, 45).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e)); // passing
																													// newer
																													// implementation

		// .forEach(e -> System.out.println(e))
		// Consumer<? super T> action
		// void accept(T t)
		List.of(23, 43, 34, 24, 45).stream().filter(new EvenNumberPredicate()).forEach(new SystemOutConsumer());

		// square of even numbers
		// map(n -> n* n)
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		List.of(23, 43, 34, 24, 45, 2).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

}
