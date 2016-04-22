package com.mani.gayi.ds.queue;

public class QueueImpl {

	private static final int QUEUE_CAPACITY = 3;
	int arr[] = new int[QUEUE_CAPACITY];
	int size = 0;
	int top = -1;
	int rear = 0;

	public void enqueue(int pushedElement) {
		if (top < QUEUE_CAPACITY - 1) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Element " + pushedElement
					+ " is pushed to Queue !");
		} else {
			System.out.println("Overflow !");
		}

	}

	public void dequeue() {
		if (top >= rear) {
			rear++;
			System.out.println("Pop operation done !");
		} else {
			System.out.println("Underflow !");
		}
	}

	public void display() {
		if (top >= rear) {
			System.out.println("Elements in Queue : ");
			for (int i = rear; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		QueueImpl queueDemo = new QueueImpl();
		System.out.println("Queue size:3");

		queueDemo.enqueue(23);
		queueDemo.enqueue(2);
		queueDemo.enqueue(73);
		queueDemo.enqueue(21);
		queueDemo.display();

		queueDemo.dequeue();
		queueDemo.dequeue();
		queueDemo.dequeue();
		queueDemo.dequeue();
		queueDemo.display();
	}
}
