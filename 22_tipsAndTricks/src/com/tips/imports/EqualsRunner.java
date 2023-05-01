package com.tips.imports;

import java.util.Objects;

class Client {

	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}
	// equals
	// hashcode

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		return id == other.id;
	}
// if two objects are equal then the hashcode will also be equal
}
public class EqualsRunner {

	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);
		System.out.println(c1.equals(c2)); // compares same memory location
		System.out.println(c1.equals(c3));
	}

}
