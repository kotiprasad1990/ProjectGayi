package com.mani.gayi.ds.trees;

public class TreeTesterSimpleFormat {
	


	// Constructing a tree
	public static void main(String[] args) {
		
		// creating a tree
		
		//			 103
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
	}
}
