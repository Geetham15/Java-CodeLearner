package com.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0; // shared instance // class variable
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() { // static method can use only static variables
		// System.out.println(name);
		// System.out.println(getName());
		return count;
	}

	public String getName() {
		System.out.println(count);

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Geetha");
		System.out.println(player1.getCount());

		Player player2 = new Player("Vanathi");
		System.out.println(player2.getCount());

	}

}
