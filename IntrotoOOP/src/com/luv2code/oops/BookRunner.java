package com.luv2code.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

//		artOfComputerProgramming.setNoOfCopies(10);
//		effectiveJava.setNoOfCopies(20);
//		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseNoOfCopies(100);
		artOfComputerProgramming.decreaseNoOfCopies(50);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}

}
