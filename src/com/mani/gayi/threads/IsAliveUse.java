package com.mani.gayi.threads;

public class IsAliveUse implements Runnable {

	public void run() {

		Thread t = Thread.currentThread();
		System.out.print(t.getName());
		// checks if this thread is alive
		System.out.println(", status = " + t.isAlive());
	}

	public static void main(String args[]) throws Exception {

		Thread t = new Thread(new IsAliveUse());
		// this will call run() function
		t.start();
		// waits for this thread to die
		t.join();
		System.out.print(t.getName());
		// checks if this thread is alive
		System.out.println(", status = " + t.isAlive());
	}
}