package com.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) { // features of java7
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[21];
		}

	}

}

//try with resource is auto closable
//Scanner implements Closable, closable extends AutoClosable, AutoClosable have a method close()
