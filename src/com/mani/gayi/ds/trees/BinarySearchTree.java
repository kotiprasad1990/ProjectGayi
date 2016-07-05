package com.mani.gayi.ds.trees;

public class BinarySearchTree {
	public TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	void printTree(TreeNode node) {
		if (node == null)
			return;

		printTree(node.left);
		System.out.print(node.data + "  ");
		printTree(node.right);

	}

	public int size(TreeNode root) {
		if (root == null)
			return (0);
		else {
			return (size(root.left) + 1 + size(root.right));
		}
	}

	public TreeNode insert(TreeNode node, int data) {
		if (node == null) {
			node = new TreeNode(data);
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}

		return (node);
	}
	
	

	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		TreeNode root = new TreeNode(93);
		b.root = root;
		b.insert(root, 789);
		b.insert(root, 199);
		b.insert(root, 1030);
		b.insert(root, 12);
		b.insert(root, 87);
		System.out.println("All Binary Tree Values: ");
		b.printTree(b.root);
		System.out.println("Size of the Tree " + b.size(b.root));


	}

}
