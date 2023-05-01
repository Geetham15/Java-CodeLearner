package com.tips.imports;

public class BlocksRunner {

	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void main(String[] args) {
		System.out.println(SECONDS_IN_DAY);
		System.out.println("main");
		{
			int i;
			System.out.println("3>2");
			System.out.println("3>2");
		}
		// System.out.println(i);
	}

}
