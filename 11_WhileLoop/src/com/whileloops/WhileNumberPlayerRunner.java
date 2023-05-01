package com.whileloops;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(10);

		player.printSquaresUptoLimit();

		System.out.println();

		player.printCubesUptoLimit();

	}
}
