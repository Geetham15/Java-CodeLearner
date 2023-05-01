package com.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("geetha", "anand");
		List<String> names2 = List.of("adam", "eve");
		// var abc = null;
		// List<List<String>>
		var names = List.of(names1, names2); // var identifies the return value //java 10 features
		names.stream().forEach(System.out::println);

		// also use var in loops
		// var can be final
		// cannot assign var to null
		// var is not a keyword

		for (var name : names) {
			System.out.println(name);
		}
		// Stream<String> filter
		var filter = List.of("geetha", "anand").stream().filter(s -> s.length() < 5);
		filter.forEach(System.out::println);
	}

}
