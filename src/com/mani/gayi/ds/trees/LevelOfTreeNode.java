package com.mani.gayi.ds.trees;

public class LevelOfTreeNode {

	
	public int getLevelOfTreeNode(TreeNode root,int data,int level)
	{
		if(root == null)
		{
			return 0;
		}
		
		if(root.getData() == data)
		{
			return level;
		}
		
		int downlevel = getLevelOfTreeNode(root.getLeft(), data, level+1);
		
		if(downlevel!=0)
		{
			return downlevel;
		}
		
		downlevel  = getLevelOfTreeNode(root.getRight(), data, level+1);
		
		return downlevel;
	}
	
	
}
