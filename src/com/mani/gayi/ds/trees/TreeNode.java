package com.mani.gayi.ds.trees;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	int data;

	
	
	public TreeNode getLeft() {
		return left;
	}



	public void setLeft(TreeNode left) {
		this.left = left;
	}



	public TreeNode getRight() {
		return right;
	}



	public void setRight(TreeNode right) {
		this.right = right;
	}



	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public TreeNode(int data) {
		this.left = null;
		this.right = null;
		this.data = data;
	}
}
