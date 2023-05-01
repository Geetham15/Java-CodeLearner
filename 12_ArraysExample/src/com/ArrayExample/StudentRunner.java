package com.ArrayExample;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		// int[] marks = new int[5];
		// int[] marks = { 99, 96, 100 };
		// Student student = new Student("Geetha", marks);
		Student student = new Student("Geetha", 97, 98, 100);
		Student student2 = new Student("Vignesh", 97, 98, 100, 99);
		Student student3 = new Student("Vanathi", 97, 98, 100, 67, 89);

		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks : " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum of Marks " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum Mark : " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum Mark :" + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Mark: " + average);

		student.addNewMark(35);
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}
}
