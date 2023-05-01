package com.tips.enums;

import java.util.Arrays;

//enum is like the class, enum can have variables, constructors and methods.
enum Season {

	FALL(4), WINTER(1), SPRING(2), SUMMER(3);
	// 0,1,2,3
	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.WINTER;
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1.ordinal()); // prints order 0
		System.out.println(Season.SPRING.ordinal());
		System.out.println(Season.SPRING.getValue());
		System.out.println(Arrays.toString(Season.values()));
	}

}
