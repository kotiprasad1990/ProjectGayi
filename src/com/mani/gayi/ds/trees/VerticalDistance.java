package com.mani.gayi.ds.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

// this class computes the vertical distance of tree
public class VerticalDistance {

	Values val = new Values();

	// 1) Recursion Vertical Order Basic ******************************** 
	// time complexity is O(n^2).

	// finding the max and min horizontal distances;
	public int findMinMax(TreeNode root, Values val, int hd) {
		if (root == null)
			return 0;
		if (val.min > hd) {
			val.min = hd;
		}
		if (val.max < hd) {
			val.max = hd;
		}

		findMinMax(root.getLeft(), val, hd - 1);
		findMinMax(root.getRight(), val, hd + 1);

		return 0;
	}

	// A utility function to print all nodes on a given line_no.
	// hd is horizontal distance of current node with respect to root.
	void printVerticalLine(TreeNode node, int line_no, int hd) {

		// Base case
		if (node == null)
			return;

		// If this node is on the given line number
		if (hd == line_no)
			System.out.print(node.getData() + " ");

		// Recur for left and right subtrees
		printVerticalLine(node.getLeft(), line_no, hd - 1);
		printVerticalLine(node.getRight(), line_no, hd + 1);
	}

	// After getting the max and min horizontal distances we will start printing
	// the children all same level.
	// The main function that prints a given binary tree in
	// vertical order
	void verticalOrder(TreeNode node) {

		// Find min and max distances with resepect to root
		findMinMax(node, val, 0);

		// Iterate through all possible vertical lines starting
		// from the leftmost line and print nodes line by line
		for (int line_no = val.min; line_no <= val.max; line_no++) {
			printVerticalLine(node, line_no, 0);
			System.out.println("");
		}
	}

	// 1) Recursion Vertical Order Basic ********************************

	// 2) Recursion Vertical Order HashMap Based ************************
	// time complexity is O(n)

	public void verticalOrderUsingHashMap(TreeNode root, int hd,
			Map<Integer, List<Integer>> map) {

		if (root == null)
			return;

		// getting the list and adding it to it.
		List<Integer> list = new ArrayList<Integer>();

		if (map.containsKey(hd)) {
			list = map.get(hd);
		}

		list.add(root.getData());
		map.put(hd, list);

		verticalOrderUsingHashMap(root.getLeft(), hd - 1, map);
		verticalOrderUsingHashMap(root.getRight(), hd + 1, map);
	}

	// 2) Recursion Vertical Order HashMap Based ************************

	// 3) Recursion Vertical Order Linked List   ************************

	// main function to traversal...
	public void verticalOrderUsingDoubleLinkedList(TreeNode root,
			NodesDoubleLinkedList linkedlist) {
		verticalOrderUsingDoubleLinkedListUtil(root, linkedlist);

		// Move the linked list to the begining...

		while (linkedlist.previous != null) {
			linkedlist = linkedlist.previous;
		}

		System.out.println("Vertical tree order : ");
		while (linkedlist.next != null) {
			List<Integer> list = linkedlist.listofNodes;
			for (Integer i : list) {
				System.out.print(" " + i + " ");
			}
			System.out.println();

			linkedlist = linkedlist.next;
		}

	}

	// for this we create a double linked list
	public void verticalOrderUsingDoubleLinkedListUtil(TreeNode node,
			NodesDoubleLinkedList linkedlist) {

		// first get the list from the linked list and add the current node data
		// to the double linked list.
		List<Integer> list = linkedlist.listofNodes;
		list.add(node.getData());
		linkedlist.listofNodes = list;

		// if the current node is having a left node
		// then we create new node and link it to the previous node of the
		// current node.

		// process left tree...
		if (node.getLeft() != null) {
			if (linkedlist.previous == null) {
				linkedlist.previous = new NodesDoubleLinkedList();
				linkedlist.previous.next = linkedlist;
			}
			verticalOrderUsingDoubleLinkedListUtil(node.getLeft(),
					linkedlist.previous);
		}

		// process right tree
		if (node.getRight() != null) {
			if (linkedlist.next == null) {
				linkedlist.next = new NodesDoubleLinkedList();
				linkedlist.next.previous = linkedlist;
			}
			verticalOrderUsingDoubleLinkedListUtil(node.getRight(),
					linkedlist.next);
		}
	}

	// 3) Recursion Vertical Order Linked List   ************************
	
	
		// creating a tree

		//		 	  103
		//			/    \
		//		 85		 180
		//		/ \		 /  \
		//	  75   99 150    700
		//	 /  \	   / \    / \
		//  30  79   131 167 500 850
		// /  \						\
		//21  45					1000
		//   /  \						\
		//  32  57						 1200		
	public static void main(String[] args) {

		TreeNode root = new TreeNode();
		root.setData(103);

		TreeNode node85 = new TreeNode(85);
		TreeNode node180 = new TreeNode(180);
		root.setLeft(node85);
		root.setRight(node180);

		TreeNode node75 = new TreeNode(75);
		TreeNode node99 = new TreeNode(99);
		TreeNode node150 = new TreeNode(150);
		TreeNode node700 = new TreeNode(700);

		node85.setLeft(node75);
		node85.setRight(node99);

		node180.setLeft(node150);
		node180.setRight(node700);

		TreeNode node30 = new TreeNode(30);
		TreeNode node79 = new TreeNode(79);
		TreeNode node131 = new TreeNode(131);
		TreeNode node167 = new TreeNode(167);
		TreeNode node500 = new TreeNode(500);
		TreeNode node850 = new TreeNode(850);

		node75.setLeft(node30);
		node75.setRight(node79);

		node99.setLeft(null);
		node99.setRight(null);

		node150.setLeft(node131);
		node150.setRight(node167);

		node700.setLeft(node500);
		node700.setRight(node850);

		TreeNode node21 = new TreeNode(21);
		TreeNode node45 = new TreeNode(45);
		TreeNode node1000 = new TreeNode(1000);

		node30.setLeft(node21);
		node30.setRight(node45);

		node79.setLeft(null);
		node79.setRight(null);

		node131.setLeft(null);
		node131.setRight(null);

		node167.setLeft(null);
		node167.setRight(null);

		node500.setLeft(null);
		node500.setRight(null);

		node850.setLeft(null);
		node850.setRight(node1000);

		TreeNode node32 = new TreeNode(32);
		TreeNode node57 = new TreeNode(57);
		TreeNode node1200 = new TreeNode(1200);

		node21.setLeft(null);
		node21.setRight(null);

		node45.setLeft(node32);
		node45.setRight(node57);

		node1000.setLeft(null);
		node1000.setRight(node1200);

		// new VerticalDistance().verticalOrder(root);

		// Map<Integer,List<Integer>> map = new
		// HashMap<Integer,List<Integer>>();
		//
		// new VerticalDistance().verticalOrderUsingHashMap(root, 0, map);
		// for(Integer i : map.keySet()){
		//
		// System.out.println(" Key is "+i+" list size is "+map.get(i).size());
		// if(map.get(i).size()>0)
		// for(Integer value : map.get(i))
		// {
		// System.out.println(" "+value+" ");
		// }
		//
		// }

		NodesDoubleLinkedList list = new NodesDoubleLinkedList();

		new VerticalDistance().verticalOrderUsingDoubleLinkedList(root, list);

	}

}

// first we are declaring a class Values which contains the variables min and
// max of integer type.

class Values {
	int max = 0;
	int min = 0;
}

class NodesDoubleLinkedList {
	List<Integer> listofNodes = new ArrayList();

	NodesDoubleLinkedList previous;

	NodesDoubleLinkedList next;

}