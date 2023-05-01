package com.tips.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class LengthComparator implements Comparator<String> {
//	@Override
//	public int compare(String str1, String str2) {
//		// TODO Auto-generated method stub
//		return Integer.compare(str1.length(), str2.length());
//	}
//}
public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(List.of("Ant", "Cat", "Ball", "elephant"));
		// Collections.sort(animals, new LengthComparator());
		// Anonymous class
		Comparator<String> lengthComparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}

		};
		Collections.sort(animals, lengthComparator);
		System.out.println(animals);
	}

}
