package com.ArrayExample;

import java.util.Arrays;

public class ArrayRunner {
	public static void main(String[] args) {
		// int[] marks = {11, 12, 13, 14, 15, 16, 17};
		int[] marks = new int[8];
		int sum = 0;
		marks[0] = 11;
		marks[1] = 12;
		marks[2] = 13;
		marks[3] = 14;
		marks[4] = 15;
		marks[5] = 16;
		marks[6] = 17;
		marks[7] = 18;

		System.out.println(Arrays.toString(marks));
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks" + i + " : " + marks[i]);
			sum = sum + marks[i];
		}
		// java 5 - Enhanced for loop
		for (int mark : marks) {
			System.out.println(mark);
		}
		System.out.println("The sum is : " + sum);

		Arrays.fill(marks, 100); // fill all marks with 100
		System.out.println(marks);

		// equals - Compare
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		System.out.println(Arrays.equals(array1, array2));
		int[] array3 = { 3, 2, 3 };
		System.out.println(Arrays.equals(array1, array3));
		// sort
		Arrays.sort(array3);
		System.out.println(array3);
}
}