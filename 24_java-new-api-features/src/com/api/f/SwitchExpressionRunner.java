package com.api.f;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeek(int day) {
		String dayOfWeek = " ";
		switch (day) {
		case 0:
			dayOfWeek = "Sunday";
			break;
		case 1:
			dayOfWeek = "Monday";
			break; // fall through
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3:
			dayOfWeek = "Wednesday";
			break;
		default:
			throw new IllegalArgumentException("Invalid Option" + day);
		}
		return dayOfWeek;
	}

	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Do some complex logic here");
			yield "Sunday"; // use yield to return the value
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		default -> throw new IllegalArgumentException("Invalid Option" + day);
		};
		return dayOfWeek;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
