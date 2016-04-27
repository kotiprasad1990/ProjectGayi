package com.mani.gayi.ds.trees;

public class TreeUtility {

	
	public  static void printTree(TreeNodeConvertBST node) {
        if (node == null)
            return;
 
        printTree(node.left);
        System.out.print(node.data + "  ");
        printTree(node.right);
    }
}
