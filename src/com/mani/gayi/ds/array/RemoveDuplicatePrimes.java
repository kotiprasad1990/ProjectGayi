package com.mani.gayi.ds.array;

import com.mani.gayi.utils.UtilityClass;

public class RemoveDuplicatePrimes {
	
	public static void main(String[] args) {
		
		int [] input = {13, 59, 23, 47, 3, 59, 53, 13, 19, 23, 3, 7 };
		System.out.println("Input Array : "+input.length);
		UtilityClass.printArrayData(input);
		
		// 
		int[] output = new RemoveDuplicatePrimes().removeDuplicates(input);
		System.out.println("Output array : "+output.length);
		UtilityClass.printArrayData(output);
	}
	
	public int[] removeDuplicates(int array[])
	{
		int newindex = -1;
		long product =1;
		int[] resultarray = new int[array.length];
		for(int noofiterations = 0 ;noofiterations<12;noofiterations++)
		{
			if(product%array[noofiterations]!=0)
			{
				newindex++;
				resultarray[newindex] = array[noofiterations];
				product =product*array[noofiterations];
			}
		}
		
		return resultarray;
	}

}
