package com.mani.gayi.ds.stack;

import java.util.Stack;

public class PrintBinaryTree {
	private Node root;

	public PrintBinaryTree() {
		root = null;
	}

	private static class Node {
		Node left;
		Node right;
		int data;

		Node(int newData) {
			left = null;
			right = null;
			data = newData;
		}
	}

	public boolean lookup(int data) {
		return (lookup(root, data));
	}

	private boolean lookup(Node node, int data) {
		if (node == null) {
			return (false);
		}

		if (data == node.data) {
			return (true);
		} else if (data < node.data) {
			return (lookup(node.left, data));
		} else {
			return (lookup(node.right, data));
		}
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}

		return (node);
	}

	public void print() {
		Stack<Node> s = new Stack<Node>();
		Node node = root;
		while (node != null) {
			s.push(node);
			node = node.left;
		}

		while (s.size() > 0) {
			node = (Node) s.pop();
			System.out.print(node.data + " ");
			if (node.right != null) {
				node = node.right;
				while (node != null) {
					s.push(node);
					node = node.left;
				}
			}
		}

	}

	public static void main(String[] args) {

		PrintBinaryTree b = new PrintBinaryTree();
		System.out.println("Insert [12,3,6] elements to Stack");
		b.insert(12);
		b.insert(3);
		b.insert(6);

		System.out.println("Traverse the elements from Stack:");
		b.print();
	}
}
