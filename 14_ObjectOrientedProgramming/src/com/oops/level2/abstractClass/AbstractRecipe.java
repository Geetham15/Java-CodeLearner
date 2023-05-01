package com.oops.level2.abstractClass;

// Abstract class can extends from another abstract class
// Abstract class can have a variable defined
// Abstract class can have a non implemented abstract methods

public abstract class AbstractRecipe {
	// prepare
	// recipe
	// cleanup
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
