package com.mani.gayi.ds.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

// About the Node used in the tree.
class Node {

	private int val;
	private ArrayList<Integer> children;

	public Node(int identifier) {
		this.val = identifier;
		children = new ArrayList<Integer>();
	}

	public int getIdentifier() {
		return val;
	}

	public ArrayList<Integer> getChildren() {
		return children;
	}

	public void addChild(int val) {
		children.add(val);
	}
}

// this is a tree which contains the root node and n number of child nodes.
class Tree {
	private final static int ROOT = 0;
	private HashMap<Integer, Node> nodes;

	public Tree() {
		this.nodes = new HashMap<Integer, Node>();
	}

	public HashMap<Integer, Node> getNodes() {
		return nodes;
	}

	public Node addNode(int val) {
		return this.addNode(val, null);
	}

	public Node addNode(int val, Integer parent) {
		Node node = new Node(val);
		nodes.put(val, node);

		if (parent != null) {
			nodes.get(parent).addChild(val);
		}

		return node;
	}

	public void display(int val) {
		this.display(val, ROOT);
	}

	public void display(int val, int depth) {
		ArrayList<Integer> children = nodes.get(val).getChildren();

		if (depth == ROOT) {
			System.out.println(nodes.get(val).getIdentifier());
		} else {
			String tabs = String.format("%0" + depth + "d", 0).replace("0",
					"    ");
			System.out.println(tabs + nodes.get(val).getIdentifier());
		}
		depth++;
		for (int child : children) {
			this.display(child, depth);
		}
	}

	public Iterator<Node> iterator(Integer identifier, boolean DepthFirst) {
		if (DepthFirst == true)
			return new TreeIterator(nodes, identifier, true);
		else
			return new TreeIterator(nodes, identifier, false);
	}

}


class TreeIterator implements Iterator<Node> {
	private LinkedList<Node> list;
	private static final int ROOT = 0;
	private HashMap<Integer, ArrayList<Integer>> levels;

	public TreeIterator(HashMap<Integer, Node> tree, int identifier,
			boolean DepthFirst) {
		list = new LinkedList<Node>();
		levels = new HashMap<Integer, ArrayList<Integer>>();

		if (tree.containsKey(identifier)) {
			if (DepthFirst == true) {
				buildList(tree, identifier);
			} else {
				buildList(tree, identifier, ROOT);

				for (Map.Entry<Integer, ArrayList<Integer>> entry : levels
						.entrySet()) {
					for (Integer child : entry.getValue()) {
						list.add(tree.get(child));
					}
				}
			}
		}
	}

	private void buildList(HashMap<Integer, Node> tree, int identifier) {
		list.add(tree.get(identifier));
		ArrayList<Integer> children = tree.get(identifier).getChildren();
		for (Integer child : children) {
			buildList(tree, child);
		}
	}

	private void buildList(HashMap<Integer, Node> tree, int identifier,
			int level) {
		if (level == ROOT) {
			list.add(tree.get(identifier));
		}

		ArrayList<Integer> children = tree.get(identifier).getChildren();

		if (!levels.containsKey(level)) {
			levels.put(level, new ArrayList<Integer>());
		}
		for (int child : children) {
			levels.get(level).add(child);
			this.buildList(tree, child, level + 1);
		}
	}

	@Override
	public boolean hasNext() {
		return !list.isEmpty();
	}

	@Override
	public Node next() {
		return list.poll();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}

public class TreeApplication {
	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.addNode(11);
		tree.addNode(42, 11);
		tree.addNode(67, 11);
		tree.addNode(76, 11);
		tree.addNode(99, 11);
		tree.addNode(99, 42);
		tree.addNode(33, 42);
		tree.addNode(9, 33);
		tree.addNode(22, 33);

		System.out.println("List of items in the Tree:");

		tree.display(11);

		System.out.print("Depth First Iteration from Tree: ");

		Iterator<Node> depthIterator = tree.iterator(11, true);
		while (depthIterator.hasNext()) {
			Node node = depthIterator.next();
			System.out.print(node.getIdentifier() + ",");
		}
		System.out.println();

		System.out.print("Breadth First Iteration from Tree: ");
		Iterator<Node> breadthIterator = tree.iterator(11, false);
		while (breadthIterator.hasNext()) {
			Node node = breadthIterator.next();
			System.out.print(node.getIdentifier() + ",");
		}
		System.out.println();

	}
}
