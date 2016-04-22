package com.mani.gayi.ds.linkedlist;

public class LinkedListPalindrome {
	 
    static boolean isPalindrome(ListNodedup head)
    {
        ListNodedup left= head;
        ListNodedup right= head;
      return isPalindromeUtil( left,right);
    }
     
    static boolean isPalindromeUtil(ListNodedup left, ListNodedup right) {
       if (right == null)
          return true;
      
       boolean isp = isPalindromeUtil(left, right.next);
       if (isp == false)
          return false;
      
       boolean isp1 = (right.val == left.val);
      
       left = left.next;
      
       return isp1;
    }
     
     
    public static void main(String[] args) {
        ListNodedup n1 = new ListNodedup(21);
        ListNodedup n2 = new ListNodedup(52);
        ListNodedup n3 = new ListNodedup(33);
        ListNodedup n4 = new ListNodedup(21);
        ListNodedup n5 = new ListNodedup(67);
         
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
         
        System.out.print("Print the list of items: ");
        printList(n1);
 
        System.out.print("Print the list of items after remove duplicate: " + isPalindrome(n1));
 
         
        ListNodedup n11 = new ListNodedup(11);
        ListNodedup n22 = new ListNodedup(22);
        ListNodedup n33 = new ListNodedup(11);
         
        n11.next = n22;
        n22.next = n33;
        printList(n11);
 
        System.out.print("Print the list of items after remove duplicate: " + isPalindrome(n11));
         
 
    }
 
    public static void printList(ListNodedup n) {
        while (n != null) {
            System.out.print(n.val + "->");
            n = n.next;
        }
        System.out.println("NULL");
    }
}
