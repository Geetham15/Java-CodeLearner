package com.thread;
//extends Thread

//implements Runnable
class Task1 extends Thread {
	@Override
	public void run() { //SIGNATURE
		// Task1
		System.out.println("\nTask1 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task2 kicked off");
		// Task2
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		Thread.yield();
		System.out.println("\n Task2 Done");

	}

}

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// states of Thread
		// NEW
		// RUNNABLE
		// RUNNING
		// BLOCKED/WAITING
		// TERMINATED/DEAD

		// Priorities
		// Max priority = 10
		// normal priority = 5
		// minimum priority = 1

		// Thread.sleep(1000)
		// Thread.yield()
		// Task1
		System.out.println("\n Task1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1 to complete
		task1.join(); // ensure the task1 is completed and then proceed the next line of code
		task2Thread.join();
		System.out.println("\n Task3 kicked off");
		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task3 Done");
		System.out.println("Main Done");
	}

}
