package com.mani.gayi.ds.trees;

/* Source : http://www.geeksforgeeks.org/write-a-c-program-to-delete-a-tree/
 * Author : Manidhar.
 * Write a program to Delete a Tree.
 * 			1
 *         / \ 
 *        2   3
 *       / \
 *      4   5
 To delete a tree we must traverse all the nodes of the tree and delete them one by one. 
 So which traversal we should use – Inorder or Preorder or Postorder. 
 Answer is simple – Postorder, because before deleting the parent node we should delete its children nodes first

 We can delete tree with other traversals also with extra space complexity 
 but why should we go for other traversals if we have Postorder available 
 which does the work without storing anything in same time complexity.

 For the following tree nodes are deleted in order – 4, 5, 2, 3, 1*/

public class DeleteBinaryTree {
	
	 TreeNode root;
	  
	    /*  This function traverses tree in post order to 
	        to delete each and every node of the tree */
	    void deleteTree(TreeNode node) 
	    {
	        if (node == null)
	            return;
	  
	        /* first delete both subtrees */
	        deleteTree(node.left);
	        deleteTree(node.right);
	  
	        /* then delete the node */
	        System.out.println("The deleted node is " + node.data);
	        node = null;
	    }
	  
	    /* Driver program to test above functions */
	    public static void main(String[] args) 
	    {
	    	DeleteBinaryTree tree = new DeleteBinaryTree();
	  
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);
	  
	        /* Print all root-to-leaf paths of the input tree */
	        tree.deleteTree(tree.root);
	        tree.root = null;
	        System.out.println("Tree deleted");
	  
	    }
}
