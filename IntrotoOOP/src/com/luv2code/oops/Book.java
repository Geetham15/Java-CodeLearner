package com.luv2code.oops;

public class Book {

	private int noOfCopies;

	public Book(int noofCopies) {
		this.noOfCopies = noofCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public int getNoOfCopies() {
		return this.noOfCopies;
	}

	// Encapsulation better validation to prevent -ve values
	public void increaseNoOfCopies(int howMuch) {
		// this.noOfCopies = this.noOfCopies + howMuch;
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		// return this.noOfCopies = this.noOfCopies - howMuch;
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}
