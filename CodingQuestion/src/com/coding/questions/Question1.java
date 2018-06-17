package com.coding.questions;

/*
 * Question 1 -- sortByStrings(s,t): Sort the letters in the string s 
 * by the order they occur in the string t. You can assume t will not have 
 * repetitive characters. For s = "weather" and t = "therapyw", the output
 *  should be sortByString(s, t) = "theeraw". For s = "good" and t = "odg", 
 *  the output should be sortByString(s, t) = "oodg".
 *  
 * @author Aishwarya
 */

public class Question1 {
	public static void main(String[] args) {
		// Fetching strings received as input
		String expectedOrder = args[0];
		String input = args[1];

		// Creating an object of the class and invoking the method
		Question1 obj = new Question1();
		String myOrderedString = obj.sortByString(expectedOrder, input);

		System.out.println("Expected order : " + expectedOrder + " and String recieved as input : " + input);
		System.out.println("Result : Ordered String is : " + myOrderedString);

	}

	/**
	 * Below class will take the expected order and the user input string and then
	 * process the user input to the order as required.
	 * 
	 * @param expectedOrder
	 * @param input
	 * @return ordered string
	 */
	public String sortByString(String expectedOrder, String input) {
		String resultStr = "";
		char[] orderderArray = expectedOrder.toLowerCase().toCharArray();

		char[] inputStr = input.toLowerCase().toCharArray();

		char[] myOrderedStr = new char[20];
		int count = 0;

		/**
		 * For every element in the ordered string, checking if that exists in the input
		 * string and if it does, adding it to a new char array.
		 */
		for (int i = 0; i < orderderArray.length; i++) {
			char elementStr = orderderArray[i];
			for (int j = 0; j < inputStr.length; j++) {
				char inputElement = inputStr[j];
				if (inputElement == elementStr) {
					myOrderedStr[count] = inputElement;
					count++;
				}
			}
		}
		resultStr = new String(myOrderedStr);

		return resultStr;

	}
}
