package com.oops.level2.interfaceAbstractExample;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };

		for (Animal animal : animals) {
			animal.bark();
		}

	}

}
