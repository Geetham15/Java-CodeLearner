package com.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Customized Priority
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// return Integer.compare(value2.length(), value1.length());//Max Length to
		// MinLength
		return Integer.compare(value1.length(), value2.length()); // Min Length to Max Length in ascending
	}

}
public class QueueRunner {

	public static void main(String[] args) {
		// PriorityQueue - natural ascending order
		// Customized Priority - order based on string length
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
