package com.mani.gayi.ds.linkedlist;

import java.util.LinkedHashMap;

public class CountRepeatItems {

	private static LinkedHashMap<Integer, Integer> countRepatedItems(
			ListNodedup n) {
		LinkedHashMap<Integer, Integer> table = new LinkedHashMap<Integer, Integer>();
		ListNodedup previous = null;
//		while (n != null) {
//			if (table.containsKey(n.val)) {
//				previous.next = n.next;
//				Integer value = table.get(n.val);
//				table.replace(n.val, value + 1);
//
//			} else {
//				table.put(n.val, 1);
//				previous = n;
//			}
//			n = n.next;
//		}
		return table;
	}

	public static void main(String[] args) {
		ListNodedup n1 = new ListNodedup(21);
		ListNodedup n2 = new ListNodedup(52);
		ListNodedup n3 = new ListNodedup(33);
		ListNodedup n4 = new ListNodedup(21);
		ListNodedup n5 = new ListNodedup(67);
		ListNodedup n6 = new ListNodedup(33);
		ListNodedup n7 = new ListNodedup(21);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		System.out.print("Print the list of items: ");
		printList(n1);
		LinkedHashMap<Integer, Integer> rd = countRepatedItems(n1);

		System.out.println("Linked list items with count:" + rd);

	}

	public static void printList(ListNodedup n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}

}
