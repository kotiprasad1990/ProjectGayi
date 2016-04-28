package com.mani.gayi.ds.trees;

import java.util.Arrays;

class TreeNodeConvertBST {
    public TreeNodeConvertBST left;
    public TreeNodeConvertBST right;
    int data;
 
    public TreeNodeConvertBST(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
 
public class SortedArrayToBST {
 
    TreeNodeConvertBST root;
 
    
     
    public TreeNodeConvertBST sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
  
        return sortedArrayToBST(num, 0, num.length - 1);
    }
  
    public TreeNodeConvertBST sortedArrayToBST(int[] num, int start, int end) {
        if (start > end)
            return null;
  
        int mid = (start + end) / 2;
        TreeNodeConvertBST root = new TreeNodeConvertBST(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);
  
        return root;
    }
         
    public static void main(String[] args) {
        SortedArrayToBST b = new SortedArrayToBST();
        TreeNodeConvertBST root = new TreeNodeConvertBST(2);
        int [] array={1,2,3,4,5,6,7,8,9};
        System.out.println("Array Values: " + Arrays.toString(array));
         
        root = b.sortedArrayToBST(array);
        System.out.print("After convert from Array to Binary Tree Values: ");
        TreeUtility.printTree(root);
        System.out.println();
    }
 
}
