package com.mani.gayi.array;

// https://leetcode.com/problems/additive-number/

//Additive number is a string whose digits can form additive sequence.
//
//A valid additive sequence should contain at least three numbers. 
//Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.
//
//For example:
//"112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
//
//1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
//"199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
//1 + 99 = 100, 99 + 100 = 199

public class AdditiveArray {

	public boolean isAdditiveNumber(String num) {

		char[] characters = num.toCharArray();

		if (characters.length >= 3) {
			for (int index = 0; index < characters.length - 2; index++) {
				int number1 = characters[index] - '0';
				int number2 = characters[index + 1] - '0';
				int number3 = characters[index + 2] - '0';
				if (number3 != number1 + number2) {
					return false;
				}

			}
		} else {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		boolean value = new AdditiveArray().isAdditiveNumber("112358");
		System.out.println("value is " + value);

	}
}
