package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	int i = 0;
	int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();// Get Lock for I
		i++;
		lockForI.unlock();// Release Lock for I
		// get i
		// increment
		// set i
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();// Get Lock for J
		j++;
		lockForJ.unlock();// Release Lock for J
		// get i
		// increment
		// set i
	}

	public int getJ() {
		return j;
	}

}
