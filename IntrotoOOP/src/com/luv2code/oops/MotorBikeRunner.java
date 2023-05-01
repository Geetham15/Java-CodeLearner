package com.luv2code.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(25);
		honda.increaseSpeed(200);
		honda.decreaseSpeed(50);
//		int ducatiSpeed = ducati.getSpeed(); // get ducati speed
//		ducatiSpeed = ducati.getSpeed() + 100; // increase by 100
//		ducati.setSpeed(ducatiSpeed); // set it to ducati

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());

		// ducati.setSpeed(20);
		// System.out.println(ducati.getSpeed());
		// honda.setSpeed(0);
		// System.out.println(honda.getSpeed());
	}

}
