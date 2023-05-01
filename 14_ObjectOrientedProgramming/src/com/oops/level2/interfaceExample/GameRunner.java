package com.oops.level2.interfaceExample;

public class GameRunner {

	public static void main(String[] args) {

		// MarioGame game = new MarioGame();
		// ChessGame game = new ChessGame();
//		GamingConsole game = new ChessGame(); // Polymorphism
//		game.up();
//		game.down();
//		game.left();
//		game.right();

		GamingConsole[] games = { new MarioGame(), new ChessGame() }; // Polymorphism
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}

	}

}
