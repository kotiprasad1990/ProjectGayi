package com.mani.gayi.ds.trees;

import java.util.Stack;

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

	public void preOrderTraversalUsingRecursion(TreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
		}
		if (root.getLeft() != null) {
			preOrderTraversalUsingRecursion(root.getLeft());
		}
		if (root.getRight() != null) {
			preOrderTraversalUsingRecursion(root.getRight());
		}
	}

	public void preOrderTraversalUsingIteration(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		if (root != null) {
			s.push(root);
			while (!s.isEmpty()) {
				TreeNode temproot = s.pop();
				System.out.println(temproot.getData());
				if (temproot.getRight() != null) {
					s.push(temproot.getRight());
				}
				if (temproot.getLeft() != null) {
					s.push(temproot.getLeft());
				}
			}
		}
	}

	public void inOrderUsingRecursion(TreeNode root) {
		if (root != null) {

			inOrderUsingRecursion(root.getLeft());
			System.out.println(root.getData());
			inOrderUsingRecursion(root.getRight());

		}
	}

	public void inOrderUsingIteration(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode current = root;
		
//			s.push(current);
//			while(!s.isEmpty() && current.getLeft() != null))
//			{
//		
//			
//			current = current.getLeft();
//			
//		}
		
		
			TreeNode temp = s.pop();
			System.out.println(temp.getData());
			if (temp.getRight() != null) {
				current = temp.getRight();
			}
		}


	public void postOrderUsingRecursion(TreeNode root) {
		if (root != null) {
			if (root.getLeft() != null) {
				postOrderUsingRecursion(root.getLeft());
			}
			if (root.getRight() != null) {
				postOrderUsingRecursion(root.getRight());
			}

			System.out.println(root.getData());
		}
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
