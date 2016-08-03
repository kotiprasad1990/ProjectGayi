package com.mani.gayi.array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*Given a list of non negative integers, arrange them such that they form the largest number.

 For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

 Note: The result may be very large, so you need to return a string instead of an integer.*/
public class LargestNumberUsingArray {

	public String largestNumber(int[] nums) {return null;}

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 5 };
		String number = new LargestNumberUsingArray().largestNumber(numbers);
		System.out.println("Number " + number);
	}
}
