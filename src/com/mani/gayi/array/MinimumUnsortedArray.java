package com.mani.gayi.array;

/* Find the Minimum length Unsorted Subarray, 
   sorting which makes the complete array sorted
   Given an unsorted array arr[0..n-1] of size n, 
   find the minimum length subarray arr[s..e] such that 
   sorting this subarray makes the whole array sorted.

Examples:
 1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], 
    your program should be able to find that the subarray lies between the indexes 3 and 8.

 2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], 
    your program should be able to find that the subarray lies between the indexes 2 and 5.*/

public class MinimumUnsortedArray {
	
	
	public int[] getUnSortedSubArray(int arr[])
	{
		int[] result = {0,0};
		
		// if array contains one element or doesn't contain any elements...
		if(arr.length<=1)
			return result;
		// if array contains two elemenst
		if(arr.length==2)
		{
			// if the first element is in larger than the second element then they are nor in sorted order.
			// so we are returning the index zero and one which are not in sorted order
			if(arr[0]>arr[1])
			{
				result[0]=0;
				result[1]=1;
				return result;
			}
			else
			{
				return result;
			}
		}
		// if array contains more than 2 elements...
		else
		{
			int index ;
			// iterate till the length of the array...
			for(index=0;index<arr.length;index++)
			{
				// if the left element is larger than the right element then stop it we got the starting index where the array is not in sorted order.
				if(arr[index]>arr[index+1])
				{
					result[0]= index;
					break;
				}
			}
			
			// if the index reaches the array length which means the given array is sorted.
			if(index == arr.length-1)
			{
				// we are returning the result starting index = 0 and ending index = 0 which means the array is not necessary to sort.
				return result;
			}
			
			int maxindex ;
			// start from the last and iterate...
			for(maxindex = arr.length-1;maxindex>0;maxindex--)
			{
				// starting from the last of the array, if the left most element is larger than the right then stop and break.
				if(arr[maxindex]<arr[maxindex-1])
				{ 
					// assigning the result[1] with the index as it index of element whose value is smaller.
					result[1]=maxindex;
					break;
				}
			}
							
			
			
		}
		
		return result;
	}

}
