package com.concurrency;

public class BiCounter {
	int i = 0;
	int j = 0;

	synchronized public void incrementI() {
		i++;
		// get i
		// increment
		// set i
	}
	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		j++;
		// get i
		// increment
		// set i
	}

	public int getJ() {
		return j;
	}

}
