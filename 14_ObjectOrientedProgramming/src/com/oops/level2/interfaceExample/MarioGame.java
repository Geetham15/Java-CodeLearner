package com.oops.level2.interfaceExample;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Goes into a hole");

	}

	@Override
	public void left() {
		System.out.println("");

	}

	@Override
	public void right() {
		System.out.println("Go Forwards");

	}

}
