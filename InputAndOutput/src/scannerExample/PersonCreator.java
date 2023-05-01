package scannerExample;

import java.util.Scanner;

public class PersonCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name, age and phone number: ");
		String name = scanner.next();
		// System.out.println("Enter the age: ");
		int age = scanner.nextInt();
		// System.out.println("Enter a phone Number: ");
		Long phoneNumber = scanner.nextLong();
		Person person = new Person(name, age, phoneNumber);

	}

}
