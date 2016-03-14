package com.mani.gayi.threads;

public class NameThreads extends Thread {
	public void run() {
		System.out.println("Running...");
	}

	public static void main(String args[]) {
		NameThreads t1 = new NameThreads();
		NameThreads t2 = new NameThreads();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());

		t1.start();
		t2.start();
		
		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
		System.out.println("After changing name of t1:" + t1.getId());
	}
}
