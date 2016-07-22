package com.mani.gayi.dp;

public class CoinChangeRecursion {

	public static int total(int n, int[] v, int i) {
		
//		System.out.println("Entering the calculation amount :"+n);
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		// means coins over and n>0 so no solution
		if (i == v.length && n > 0) {
			return 0;
		}
		return total(n - v[i], v, i) + total(n, v, i + 1);
	}
	// Input: 3 Parameters.
	// 1. Takes a set of coin denominations in the form of array.
	// 2. passing the number of coins to be consider.
	int count( int coins[], int numberofcoins, int amount )
	{
		System.out.println("value of m is : "+numberofcoins+" value of n is : "+amount);
	    // If n is 0 then there is 1 solution (do not include any coin)
	    if (amount == 0){
	    	System.out.println(" value of m is "+numberofcoins);
	    	return 1;
	    }
	     
	    // If n is less than 0 then no solution exists
	    if (amount < 0)
	        return 0;
	 
	    // If there are no coins and n is greater than 0, then no solution exist
	    if (numberofcoins <=0 && amount >= 1)
	        return 0;
	 
	    // count is sum of solutions (i) including coins[numberofcoins-1] (ii) excluding coins[numberofcoins-1]
	    return count( coins, numberofcoins - 1, amount ) + count( coins, numberofcoins, amount-coins[numberofcoins-1] );
	}
	
	public static void main(String[] args) {
		
		int coinden[] ={1,2};
		int amount = 4;
		int numberofchoices = total(amount, coinden, 0);
		
		
		int numberofchoices2 = new CoinChangeRecursion().count(coinden, coinden.length,amount);
		
		System.out.println("Number of coins arranged can be Method 1:"+numberofchoices);
		
		System.out.println("Number of coins ... method 2 :"+numberofchoices2);
		
	}
	
}
