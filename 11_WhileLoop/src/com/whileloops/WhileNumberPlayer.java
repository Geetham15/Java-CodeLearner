package com.whileloops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// For limit = 30, output would be 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i <= limit) {

			System.out.print(i * i + " ");
			// System.out.println();
			i++;
		}

	}

	// For limit = 30, output would be 1 8 27
	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i * i <= limit) {

			System.out.print(i * i * i + " ");
			// System.out.println();
			i++;
		}
	}

}
