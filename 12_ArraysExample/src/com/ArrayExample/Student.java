package com.ArrayExample;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	// public Student(String name, int[] marks) {
	public Student(String name, int... marks) { // varargs
		this.name = name;
		// this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		// return marks.length; // for array
		return marks.size(); // for arrayList
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// For array
//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
		// For arraylist use collections
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE; // 99, 98, 100
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		// return new BigDecimal(sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		// 98.66666666666 Precision (3) Rounding mode
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {

		marks.remove(index);
	}
}
