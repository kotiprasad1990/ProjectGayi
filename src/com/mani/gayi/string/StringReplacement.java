package com.mani.gayi.string;

// One of the common programming tasks is to replace 
//characters or substring from a String object in Java. 

//For example, you have a String "internet" and you want to replace the letter "i"
//with letter "b", how do you that? 

//Well, String class in Java provides several methods to replace characters, 
//CharSequence and substring from a String in Java.

//You can call replace method on the String, where you want to replace characters
//and it will return a result where characters are replaced. 

//What is the most important point to remember is that the result object would be a new String object? 

//Since String is immutable in Java, every time you perform an operation on String either replacement 
//or removing white space from String, it generates a new String object. 

//The good thing about these methods is that they support regular expression, 
//which means you can specify a pattern and all the characters which match the pattern will be replaced. 

//There are four overloaded method to replace String in Java :

//replace(char oldChar, char newChar)
//replace(CharSequence target, CharSequence replacement)
//replaceAll(String regex, String replacement)
//replaceFirst(String regex, String replacement)

//CharSequence is added on Java 1.5. CharSequence is actually a super interface for String.

//StringBuffer and StringBuilder in Java, which means you can pass any of String.

//StringBuffer or StringBuilder Object as argument to this replace method. 

//The replaceFirst() and replaceAll() are very powerful and accepts regular expression. 

//replaceFirst() only replace first match, while replaceAll replaces all matches with replacement String provided.

public class StringReplacement {

	private String word = null;

	public StringReplacement(String s) {
		this.word = s;
	}

	// Method 1
	public void replace(char charactertoreplace, char replacingcharacter) {

		int length = word.length();

		char[] stringcharacters = word.toCharArray();
		for (int stringlen = 0; stringlen < length; stringlen++) {
			if (stringcharacters[stringlen] == charactertoreplace) {
				stringcharacters[stringlen] = replacingcharacter;
			}
		}

		word = String.valueOf(stringcharacters);
	}

	public String getWord() {
		return word;
	}

	// main method to test the program...
	public static void main(String[] args) {

		StringReplacement s = new StringReplacement("Hooollo");
		System.out.println("Before Replacement " + s.getWord());
		s.replace('o', 'e');
		System.out.println("After Replacement " + s.getWord());

	}
}
