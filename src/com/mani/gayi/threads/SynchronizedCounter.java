package com.mani.gayi.threads;

class CounterS {
	private int c = 0;

	public synchronized void increment() {
		System.out.println("Incrementing C");
		c++;
		System.out.println("C value "+c);
	}

	public synchronized void decrement() {
		System.out.println("Decrementing C ");
		c--;
		System.out.println("C Value "+c);
	}

	public synchronized int value() {
		return c;
	}
}


public class SynchronizedCounter {
	public static void main(String... args) {
		CounterS counter = new CounterS();
		Thread it = new IncrementThread1(counter);
		Thread dt = new DecrementThread1(counter);

		it.start();
		dt.start();

	}
}

class IncrementThread1 extends Thread {
	CounterS counter;

	public IncrementThread1(CounterS counter) {
		this.counter = counter;
	}

	public void run() {
		counter.increment();
		
	}
}

class DecrementThread1 extends Thread {
	CounterS counter;

	public  DecrementThread1(CounterS counter) {
		this.counter = counter;
	}

	public void run() {
		counter.decrement();
	}
}

