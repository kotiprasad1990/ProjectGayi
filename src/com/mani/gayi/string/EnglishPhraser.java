package com.mani.gayi.string;

/* Author : Manidhar.
 * Integer to English Phrase
 * http://yuanhsh.iteye.com/blog/2219708
 * Given an integer between 0 and 999,999, 
 print an English phrase that describes the integer (eg, “One Thousand, Two Hundred and Thirty Four”)*/

public class EnglishPhraser {

	String[] till20 = { "Zero", "One", "Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
			"Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen", "Twenty" };

	String[] tens = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety" };

	public String numberBelowThousand(int number) {

		// if the given number is zero then return the word zero...
		if (number == 0)
			return till20[0];

		// taking a string variable to return the result.
		String ret = "";

		// if the number is greater than 100
		if (number > 100) {

			// getting the which number of hundred and then concatinating the
			// number with hundred.
			ret = till20[number / 100] + " Hundred";

			// calculating the mod of the number.
			number = number % 100;

			// if the mod value is zero then it only hundred value nothing else
			// so we return it.
			if (number == 0) {
				return ret;
			}
			// if it number is not zero then there is something to concatenate.
			else {
				ret += " and ";
			}
		}

		// if the mod number is less than twenty then concatenate it.
		if (number <= 20) {
			ret += till20[number];
		}
		// if the given number is larger then 20 and less than hundred the
		// following process is repeated.
		else {
			ret += tens[number / 10];
			number %= 10;
			if (number > 0)
				ret += " " + till20[number];
		}
		return ret;
	}

//	Input : Number ( 0 and 999,999)
//	Output : String
	public String parseNumberToEnglish(int number) {
		int part1 = number / 1000;
		int part2 = number % 1000;
		String res;
		if (part1 == 0) {
			res = numberBelowThousand(part1) + " Thousand";
			if (part2 == 0)
				res += ", " + numberBelowThousand(part2);
		} else {
			res = numberBelowThousand(part2);
		}
		return res;
	}
}
