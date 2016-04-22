package com.mani.gayi.ds.linkedlist;

class TripletNode {
	int val;
	TripletNode next;

	TripletNode(int x) {
		val = x;
		next = null;
	}
}

public class FindTriplet {

	public static boolean isTripletPresent(TripletNode aHead,
			TripletNode bHead, TripletNode cHead, int num) {
		TripletNode a = aHead;
		while (a != null) {
			TripletNode b = bHead;
			TripletNode c = cHead;

			while (b != null && c != null) {
				int sum = a.val + b.val + c.val;
				if (sum == num) {
					return true;
				} else if (sum < num) {
					b = b.next;
				} else {
					c = b.next;
				}
			}
			a = a.next;
		}
		System.out.print("No such triplet ");
		return false;
	}

	public static void main(String[] args) {
		TripletNode n1 = new TripletNode(1);
		TripletNode n2 = new TripletNode(2);
		TripletNode n3 = new TripletNode(3);

		TripletNode n11 = new TripletNode(5);
		TripletNode n22 = new TripletNode(6);
		TripletNode n33 = new TripletNode(7);

		TripletNode n111 = new TripletNode(5);
		TripletNode n222 = new TripletNode(6);
		TripletNode n333 = new TripletNode(7);
		
		n1.next = n2;
		n2.next = n3;

		n11.next = n22;
		n22.next = n33;

		n111.next = n222;
		n222.next = n333;

		System.out.print("Print the list of items: ");
		printList(n1);

		System.out.print("Print the list of items: ");
		printList(n11);

		System.out.print("Print the list of items: ");
		printList(n111);

		boolean r = isTripletPresent(n1, n11, n111, 11);
		System.out.print("Does three linked list contain triplet: " + r);
	}

	public static void printList(TripletNode n) {
		while (n != null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
		System.out.println("NULL");
	}
}
