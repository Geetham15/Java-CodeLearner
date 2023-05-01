package com.tips.imports;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.util.ArrayList;

public class ImportsRunner {

	public static void main(String[] args) {

		System.out.println("Impports");
		out.println("Static Imports");

		// Collections.sort(new ArrayList<String>());
		sort(new ArrayList<String>());
	}

}
