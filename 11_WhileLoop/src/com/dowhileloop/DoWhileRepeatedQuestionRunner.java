package com.dowhileloop;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a number ");
		//int num = scanner.nextInt();
		//Print cube of the number

		// Do this repeatedly until the user enters a negative number
		int num;
		do {
			System.out.println("Enter a number ");
			num = scanner.nextInt();
			if(num > 0) {
				System.out.println("Cube is " + (num * num * num));
			} else {
				System.out.println("Thank You! Have Fun!");
			}
		} while (num >= 0);


	}

}
