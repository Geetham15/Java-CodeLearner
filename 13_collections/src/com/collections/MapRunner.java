package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before.";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();

		for (char character : characters) {
			// Get the character
			Integer integer = occurances.get(character);
			// if the character is not there, initialize to 1
			if (integer == null) {
				occurances.put(character, 1);
			} else { // if it is there, increment the character count by 1
				occurances.put(character, integer + 1);
			}

		}
		System.out.println("Character Occurances : " + occurances);

		Map<String, Integer> stringOccurances = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			// Get the word
			Integer integer = stringOccurances.get(word);
			// if the character is not there, initialize to 1
			if (integer == null) {
				stringOccurances.put(word, 1);
			} else { // if it is there, increment the character count by 1
				stringOccurances.put(word, integer + 1);
			}

		}
		System.out.println("stringOccurances : " + stringOccurances);

	}

}
