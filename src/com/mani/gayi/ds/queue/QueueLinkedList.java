package com.mani.gayi.ds.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueLinkedList<T> implements Queue<T> {

	private int total;
	private Node first, last;

	public static void main(String args[]) {

		QueueLinkedList<Integer> obj = new QueueLinkedList<Integer>();

		System.out
				.println("Enqueue items in the queue linked list: 34, 44, 99, 11, 345");
		obj.enqueue(34);
		obj.enqueue(44);
		obj.enqueue(99);
		obj.enqueue(11);
		obj.enqueue(345);

		System.out.println("Items in the queue linked list: " + obj.toString());

		System.out.println("Dequeue item in the queue linked list: "
				+ obj.dequeue());
		System.out.println("Dequeue item in the queue linked list: "
				+ obj.dequeue());

		System.out.println("Items in the queue linked list: " + obj.toString());

	}

	private class Node {
		private T ele;
		private Node next;
	}

	public QueueLinkedList() {
	}

	public QueueLinkedList<T> enqueue(T ele) {
		Node current = last;
		last = new Node();
		last.ele = ele;

		if (total++ == 0)
			first = last;
		else
			current.next = last;

		return this;
	}

	public T dequeue() {
		if (total == 0)
			throw new NoSuchElementException();

		T ele = first.ele;
		first = first.next;

		if (--total == 0)
			last = null;
		return ele;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tmp = first;
		while (tmp != null) {
			sb.append(tmp.ele).append(", ");
			tmp = tmp.next;

		}
		String str = sb.substring(0, sb.length() - 2);
		return str;
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean contains(Object arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean isEmpty() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public Iterator<T> iterator() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean remove(Object arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException("");
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean add(T arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public T element() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public boolean offer(T arg0) {
		throw new UnsupportedOperationException("");
	}

	@Override
	public T peek() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public T poll() {
		throw new UnsupportedOperationException("");
	}

	@Override
	public T remove() {
		throw new UnsupportedOperationException("");
	}
}
