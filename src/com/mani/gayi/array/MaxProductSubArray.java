package com.mani.gayi.array;

/*
 * Author : Manidhar.
 * Source : http://yuanhsh.iteye.com/blog/2233972
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.*/

public class MaxProductSubArray {
	
	public int maxProduct(int[] number)
	{
		// if there are one element or less than one element return zero.
		if(number.length<=1)
			return 0;
		// if there are only 2 elements return the product of those 2 numbers.
		else if (number.length==2)
			return number[0]*number[1];
		// initially considering the first number as max number.
		int maxnumber = number[0];
		// initially considering the second number as input
		int minnumber = number[0];
		// Initializing the result in result variable.
		int result = 0;
		// iterating the number of times equal to the arrays length.
		for(int totaliterations = 0;totaliterations<number.length;totaliterations++)
		{
			int smallValue = minnumber * number[totaliterations];
			int largeValue = maxnumber * number[totaliterations];
			maxnumber = Math.max(Math.max(smallValue, largeValue),maxnumber );
			minnumber = Math.min(Math.min(smallValue, largeValue),minnumber );
			result = Math.max(maxnumber,minnumber);
		}
		
		
		return result;
	}

}
