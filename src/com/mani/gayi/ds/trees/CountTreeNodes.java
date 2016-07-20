package com.mani.gayi.ds.trees;

public class CountTreeNodes {

	public int countTreeNodes(TreeNode root) {
		if (root == null)
			return 0;
		else {
			if (root.getLeft() == null && root.getRight() == null) {
				return 1;
			}

			else {
				return (1 + countTreeNodes(root.getLeft()) + countTreeNodes(root
						.getRight()));
			}
		}

	}

}