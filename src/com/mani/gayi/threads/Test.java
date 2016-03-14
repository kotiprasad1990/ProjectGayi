package com.mani.gayi.threads;

public class Test {
	public static void main(String... args) {
		Counter counter = new Counter();
		Thread it = new IncrementThread(counter);
		Thread dt = new DecrementThread(counter);

		it.start();
		dt.start();

	}
}

class IncrementThread extends Thread {
	Counter counter;

	public IncrementThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		counter.increment();
		
	}
}

class DecrementThread extends Thread {
	Counter counter;

	public DecrementThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		counter.decrement();
	}
}

class Counter {
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}
