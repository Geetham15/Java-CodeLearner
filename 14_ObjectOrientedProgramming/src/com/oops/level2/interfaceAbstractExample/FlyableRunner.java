package com.oops.level2.interfaceAbstractExample;

public class FlyableRunner {
	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable flyable : flyingObjects) {
			flyable.fly();
		}

	}
}
