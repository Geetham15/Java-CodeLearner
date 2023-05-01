package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[21];


	} catch (Exception e) {
		e.printStackTrace();
	} finally { // code in finally is always executed
		System.out.println("Before scanner close");
		if (scanner != null) {
		scanner.close();
		}
		// when is the finally code not execute.
		// In the above example, if any erros happened in sysout statement then the
		// below line of code will not execute.
	}
	System.out.println("Just before closing out main");
	}

}

// try, catch, finally will compile and run
// try and finally will compile and run
// only try will not run
