package com.mani.gayi.ds.list;

import java.util.Scanner;

public class LinkedList {

	private Node head = null;

	public static void main(String[] args) {
		System.out.println("Testing Linked List");
		LinkedList listObject = new LinkedList();
		System.out.println("Linked List Operations...");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.View Linked List");
			System.out.println("2.Add Link");
			System.out.println("3.Delete Link");
			System.out.println("4. Search data");

			int input = scanner.nextInt();
			listObject.processInput(input);
		}

	}

	public void processInput(int input) {

		System.out.println("-- Processing the Input ----");
		switch (input) {

		case 1:
			System.out.println("Performing Linked List View Operation ...");
			viewLinkedList();
			break;
		case 2:
			System.out.println("Adding a new Link to the Linked List");
			System.out.println("Enter data to be added ");
			Scanner sc = new Scanner(System.in);
			addNode(sc.nextLine());
			break;
		case 3:
			System.out.println("Deleting Link to the Linked List");
			System.out.println("Enter data to be deleted ");
			Scanner scc = new Scanner(System.in);
			deleteNode(scc.nextLine());
			break;

		}

	}

	private void addNode(String data) {
		// creating a new node.
		Node node = new Node();
		node.setData(data);

		if (this.head == null) {
			this.head = node;
			// node.setNode(null);
		} else {
			node.setNode(head);
			this.head = node;

		}

	}

	private void viewLinkedList() {

		Node iterator = head;

		while (iterator != null) {
			String data = iterator.getData();
			System.out.println(" : " + data);
			iterator = iterator.getNode();

		}

	}

	public void deleteNode(String data) {
		
		Node reference= head;
		Node navigator = head;
		System.out.println("Entering delete Node");
		if(head == null)
			System.out.println("List is empty");
		else
		{
			if(navigator.getData().equals(data) && navigator.getNode()==null)
			{
				head = null;
			}
			
			else if(navigator.getData().equals(data) && navigator.getNode()!=null)
			{
				head = navigator.getNode();
			}
			
			while(navigator !=null )
			{
				if(navigator.getData().equals(data) )
				{
					System.out.println("Navigator.getData "+navigator.getData()+" Navigator.getNode "+navigator.getNode());
					reference.setNode(navigator.getNode());
					return;
					
				}
				reference=navigator;
				navigator = navigator.getNode();
				System.out.println("Printing Head "+head);
			}
			
			
		}
			
			
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}

class Node {
	private String data;
	private Node node;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}