package com.api.h;

public class RecordsRunner {

	// java 16 features
	// Eliminate verbosity in creating Java Beans
	// Public accessor methods, constructor, equals, hascode and toString are
	// automatically created
	// You can create custom implementations if you would want
	record Person(String name, String email, String phoneNumber) {
		// compact constructor are only allowed in records
		// You can add static fields, static initializers and static methods
		// but you cannot add instance variables or instance intializers
		// however you can add instance methods

		Person {
			if (name == null) {
				throw new IllegalArgumentException("name is null");
			}
		}

		// instance method
		public String name() {
			System.out.println("Do something");
			return name;
		}
		// custom constructor
//		Person(String name, String email, String phoneNumber) {
//			if (name == null) {
//				throw new IllegalArgumentException("name is null");
//			}
//			this.name = name;
//			this.email = email;
//			this.phoneNumber = phoneNumber;
//		}
	}

	public static void main(String[] args) {
		Person person1 = new Person("Geetha", "Geetha@email.com", "123-456-7890");
		Person person2 = new Person("Geetha", "Geetha@email.com", "123-456-7890");
		Person person3 = new Person("Geetha", "Geetha@email.com", "123-456-7890");

		System.out.println(person1.equals(person2));
		System.out.println(person1.name());

	}

}
