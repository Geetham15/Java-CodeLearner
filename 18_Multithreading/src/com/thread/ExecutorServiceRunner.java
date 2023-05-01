package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // SIGNATURE
		// Task1
		System.out.println("\nTask " + number + " started");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task " + number + " Done");
	}
}
public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5); // 5 threads active at a time
		executorService.execute(new Task(1)); // Task1 start and finish his work
		executorService.execute(new Task(2)); // Then task2 will start
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		System.out.println("\nTask3 kicked off");

		executorService.shutdown();
	}

}
