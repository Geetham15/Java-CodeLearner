package com.oops.level2.abstractClass;

public class RecipeRunner {

	public static void main(String[] args) {

		Recipe1 recipe = new Recipe1();
		recipe.execute();

		RecipeWithMicrowave recipeWithMW = new RecipeWithMicrowave();
		recipeWithMW.execute();

	}

}
