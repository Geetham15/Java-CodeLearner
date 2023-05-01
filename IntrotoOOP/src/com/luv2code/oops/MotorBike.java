package com.luv2code.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	MotorBike() { // no argument constructor
		// this.speed = 5;
		this(5); // this will call other constructor MotorBike(int speed)
	}
	// constructor - name of the method is exactly the same as the class name
	public MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) { // local variable

		if (speed > 0) {
			this.speed = speed;
		}
	}

	void start() {
		System.out.println("Bike started");
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
//		if(this.speed - howMuch > 0)
//			this.speed = this.speed - howMuch;
		setSpeed(this.speed - howMuch);
	}
}

//Encapsulation - Technique of wrapping data and code together into a single unit.
//Abstraction - Technique to hide complex implementation details and provide a simplified view.
//Constructor - Special method that initializes objects when they are created.
//OOP -  Focuses on objects and their interactions by defining blueprints called classes
