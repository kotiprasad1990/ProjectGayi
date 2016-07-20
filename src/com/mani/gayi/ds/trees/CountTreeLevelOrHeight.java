package com.mani.gayi.ds.trees;

public class CountTreeLevelOrHeight {

	// counting the number of levels in a tree.
	// i.e. nothing but finding the height of the tree.
	
	public int countLevelOfTree(TreeNode node)
	{
		if(node==null)
			return 0;
		else
		{
			return Math.max(countLevelOfTree(node.getLeft()), countLevelOfTree(node.getRight()))+1;
		}
	}
	
	
}
