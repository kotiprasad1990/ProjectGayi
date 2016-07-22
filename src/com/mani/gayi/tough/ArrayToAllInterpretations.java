package com.mani.gayi.tough;

//A Java program to print all interpretations of an integer array
import java.util.*;


public class ArrayToAllInterpretations {

	public static HashMap<Integer, Character> map = new HashMap<Integer, Character>();
 
 public static void loadHaspMap(){
     for (int i = 1; i<=26; i++) 
             map.put(i,(char)(96+i));
 }
 
 public static void printMap(){
     for (int i : map.keySet()){
         System.out.println(i +", " + map.get(i));
     } 
 }
 
 public static String combinations(int start, int end, String s, int[] A){
     if(start > end) return s;
     
     String newS = s + map.get(A[start]);

     System.out.println("Method start : "+newS);
     
     for(int i= start; i<= end; i++){
         
         newS = combinations(i+1, end, newS, A);
         
         if(i+1 <= end){
             String s1= "";
             if((i-1) >=0){
                 int count =0;
                 if(newS.length() == A.length){
                     while(count <= i-1){
                         char firstChar = map.get(A[count]);
                         s1= s1+ firstChar;
                         count++;
                     }
                 }
                 else{
                     String prevS="";
                     while(count <= i-1){
                         prevS = prevS + Integer.toString(A[count]);
                        
                         count++;
                     }
                     if(prevS != null){
                         int valPrev = Integer.parseInt(prevS);
                         char firstChar = map.get(valPrev);
                         s1= s1+ firstChar;
                     }
                 }
                 
             }
             int val = Integer.parseInt(Integer.toString(A[i]) + Integer.toString(A[i+1]));
             char twoChar='\0';
             if(val <= 26)
                twoChar = map.get(val);
             newS = s1 + twoChar;
         }
         
     }
     System.out.println(newS +" ");
     return newS;
 }
	// Driver method to test above methods 
	public static void main(String args[]) {

		loadHaspMap();
	
		// abba abu ava lba lu
		int[] arr = {1, 2, 2, 1};
		combinations(0,3,"", arr);
		System.out.println();
		
//		 int[] arr1 = {1, 2, 1};
//     combinations(0,2,"", arr1);
//     System.out.println();
//     
//     // aaa(1,1,1) ak(1,11) ka(11,1)
//     int[] arr2 = {1, 1, 1};
//     combinations(0,2,"", arr2);
//     System.out.println();
//     // bf(2,6) z(26)
//     int[] arr3 = {2, 6};
//     combinations(0,1,"", arr3);
//     System.out.println();
    
	}
}
