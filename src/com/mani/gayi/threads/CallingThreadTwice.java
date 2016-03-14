package com.mani.gayi.threads;

public class CallingThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		CallingThreadTwice t1 = new CallingThreadTwice();
		t1.start();
		t1.start();
	}
}