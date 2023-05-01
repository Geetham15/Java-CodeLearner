package com.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {

		// Object composition
		Address homeAddress = new Address("line1", "Chennai", "632002");
		Customer customer = new Customer("Geetha", homeAddress);

		Address workAddress = new Address("work line1", "Chennai", "632002");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}
