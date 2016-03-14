package com.mani.gayi.threads;

public class InterruptMessages {
	public static void main(String args[]) throws InterruptedException {

		Thread loop = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hi");
				while (true) {
					if (Thread.interrupted()) {
						break;
					}
					// Continue to do nothing
				}

			}
		});
		System.out.println("Started");
		loop.start();
		boolean interruptedvalue = loop.isInterrupted();
		System.out.println("use of is Interrupted " + interruptedvalue);

		// i am interupting the loop thread now...
		loop.interrupt();
		boolean interruptedvalue2 = loop.isInterrupted();
		System.out.println("use of is Interrupted " + interruptedvalue2);

		System.out.println("Stopped");
		// loop.interrupt();
	}
}