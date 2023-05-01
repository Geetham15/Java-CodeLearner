package main.java.com.example;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] scores = new Integer[] { 80, 66, 73, 92, 43 };
		Stream<Integer> scoresStream = Arrays.stream(scores);

		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
		List<String> sortedShoppingList = shoppingList.stream().sorted().map(item -> item.toUpperCase())
				.filter(item -> item.startsWith("B")).collect(Collectors.toList());
		System.out.println(sortedShoppingList);
//		Stream<String> shoppingListStream = shoppingList.stream();
//		shoppingListStream.sorted().map(item -> item.toUpperCase()).filter(item -> item.startsWith("B"))
//				.forEach(item -> {
//					System.out.println(item);
//				});
		System.out.println(shoppingList);
		// shoppingListStream.forEach(item -> System.out.println(item));
		Stream<String> lettersStream = Stream.of("a", "b", "c");
	}

}
