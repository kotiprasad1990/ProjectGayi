package com.mani.gayi.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalOrNot {

	// 1) Using Recursion *************************************
	// Time complexity of two trees be m and n then complexity of sameTree() is O(m) 
	public boolean identicalTrees(TreeNode tree1, TreeNode tree2) {
		if (tree1 == null && tree2 == null)
			return true;

		if (tree1 != null && tree2 != null) {
			return (tree1.getData() == tree2.getData()
					&& identicalTrees(tree1.getLeft(), tree2.getRight()) && identicalTrees(
						tree1.getRight(), tree2.getRight()));
		}

		return false;

	}
	
	// 1) Using Recursion *************************************
	
	
	// 2) Using Iteration *************************************
	// Time complexity of solution is O(n + m) where m and n are number of nodes in two trees.
	
	public boolean identicalTreesUsingIteration(TreeNode tree1,TreeNode tree2)
	{
		Queue queue1 =new LinkedList();
		Queue queue2 =new LinkedList();
		
		// first i am adding the root data to the queue and before adding validating...
		
		if(tree1 == null && tree2 == null)
			return true;
		if(tree1!=null || tree2 !=null)
			return false;
		
		queue1.add(tree1.getData());
		queue2.add(tree2.getData());
		
		while(queue1.isEmpty() && queue2.isEmpty())
		{
			// get the front nodes...
			int data1 = ((TreeNode)(queue1.peek())).getData();
			int data2 = ((TreeNode)(queue2.peek())).getData();
			
			if(data1!=data2)
				return false;
			
			// removing the elements as they are equal...
			queue1.poll();
			queue2.poll();
			
			// adding the left elements to queue if they exists...
			
			if(tree1.getLeft()!=null && tree2.getLeft()!=null)
			{
				queue1.add(tree1.getLeft());
				queue2.add(tree2.getLeft());
			}
			else
			{
				return false;
			}
			
			// adding the right elements to the queue if they exits
			if(tree1.getRight()!=null && tree2.getRight()!=null)
			{
				queue1.add(tree1.getRight());
				queue2.add(tree2.getRight());
			}
			else
			{
				return false;
			}
			
			
			
		}
		
		return true;
	}
	
	// 2) Using Iteration *************************************	
}
