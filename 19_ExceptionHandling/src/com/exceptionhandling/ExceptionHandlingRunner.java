package com.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}

	private static void method2() {
		try {
		String str = null;
		str.length();
		System.out.println("method2 end");
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	}

}
