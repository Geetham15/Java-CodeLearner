import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		boolean isWeekDay = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dayNumber and Month Number");
		int dayNumber = scanner.nextInt();
		int monthNumber = scanner.nextInt();
		System.out.println("Day number is " + dayNumber);
		System.out.println("Month number is " + monthNumber);
		isWeekDay = isWeekDay(dayNumber);
		System.out.println("Is Week Day? " + isWeekDay);
		String nameOfMonth = determineNameOfMonth(monthNumber);
		System.out.println("The name of the month is " + nameOfMonth);
		String nameOfDay = determineNameOfDay(dayNumber);
		System.out.println("The name of the day is " + nameOfDay);
	}

	private static String determineNameOfDay(int dayNumber) {
		String nameOfDay = "";
		switch (dayNumber) {
		case 0:
			nameOfDay = "Sunday";
			break;
		case 1:
			nameOfDay = "Monday";
			break;
		case 2:
			nameOfDay = "Tuesday";
			break;
		case 3:
			nameOfDay = "Wednesday";
			break;
		case 4:
			nameOfDay = "Thursday";
			break;
		case 5:
			nameOfDay = "Friday";
			break;
		case 6:
			nameOfDay = "Saturday";
			break;
		default:
			System.out.println("Invalid Day");
		}
		return nameOfDay;
	}

	private static String determineNameOfMonth(int monthNumber) {
		String nameOfMonth = "";

		switch (monthNumber) {
		case 1:
			nameOfMonth = "January";
			break;
		case 2:
			nameOfMonth = "Febrauary";
			break;
		case 3:
			nameOfMonth = "March";
			break;
		case 4:
			nameOfMonth = "April";
			break;
		case 5:
			nameOfMonth = "May";
			break;
		case 6:
			nameOfMonth = "June";
			break;
		case 7:
			nameOfMonth = "July";
			break;
		case 8:
			nameOfMonth = "August";
			break;
		case 9:
			nameOfMonth = "September";
			break;
		case 10:
			nameOfMonth = "October";
			break;
		case 11:
			nameOfMonth = "November";
			break;
		case 12:
			nameOfMonth = "December";
			break;
		default:
			nameOfMonth = "Invalid Month";
		}
		return nameOfMonth;
	}

	private static boolean isWeekDay(int dayNumber) {
		boolean isWeekDay = false;
		switch(dayNumber) {
		case 0:
		case 6:
			isWeekDay = false;
			break;

		case 1:case 2: case 3: case 4: case 5:
			isWeekDay = true;

		}
		return isWeekDay;
}
}