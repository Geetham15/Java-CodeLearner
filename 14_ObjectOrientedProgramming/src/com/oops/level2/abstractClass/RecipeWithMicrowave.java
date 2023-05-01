package com.oops.level2.abstractClass;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave oven");

	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the microwave oven");

	}

	@Override
	void cleanup() {
		System.out.println("Clean up the utensils");
		System.out.println("Switch off the microwave oven");
	}

}
