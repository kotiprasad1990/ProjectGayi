package com.mani.gayi.ds.trees;

// Diameter : longest path between two nodes in a binary tree
// There are three cases to consider when trying to find the longest path between two nodes in a binary tree (diameter): 

// The longest path passes through the root, 
// The longest path is entirely contained in the left sub-tree, 
// The longest path is entirely contained in the right sub-tree. 
// The longest path through the root is simply the sum of the heights of the left and right sub-trees + 1 (for the root node), 
// and the other two can be found recursively:



public class TreeDiameter {

	
	// takes the complexity of N^2 times...
	public static int getDiameter(TreeNode root) {        
	    if (root == null)
	        return 0;
	    int rootDiameter = getHeight(root.getLeft()) + getHeight(root.getRight()) + 1;
	    int leftDiameter = getDiameter(root.getLeft());
	    int rightDiameter = getDiameter(root.getRight());

	    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}

	public static int getHeight(TreeNode root) {
	    if (root == null)
	        return 0;
	    return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
	}
}
