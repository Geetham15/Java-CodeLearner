package com.api.a;

import java.util.ArrayList;
import java.util.List;

//Whenever you want to create Immutable list of values from a existing list, you can use the List.copyOf()
//Simpiler method you can use in Set and Map
public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ranga");
		names.add("Ravi");
		names.add("John");
		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
		// List.copyOf(null)
	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
	}

}
