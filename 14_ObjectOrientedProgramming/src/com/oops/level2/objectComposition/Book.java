package com.oops.level2.objectComposition;

import java.util.ArrayList;

public class Book {

	// state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<Review>();

	// creation
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	// operations

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id - %d, name - %s, author - %s, review - %s", id, name, author, reviews);
	}
}
