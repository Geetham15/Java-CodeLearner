package com.oops.level2.objectComposition;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOPS", "Ranga");
		book.addReview(new Review(10, "Great Book", 5));
		System.out.println(book);
	}

}
