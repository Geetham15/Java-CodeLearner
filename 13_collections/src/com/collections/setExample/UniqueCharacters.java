package com.collections.setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		System.out.println(characters);
		// unique - Set
		// Tree - sorted order
		// Hash
		// LinkedHash - maintains order without duplicates - insertion order

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("Tree Set - " + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("Linked Hash Set - " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("Hash Set - " + hashSet);
	}

}
