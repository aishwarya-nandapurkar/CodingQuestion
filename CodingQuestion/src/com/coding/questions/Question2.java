package com.coding.questions;

/**
 * Question 2 -- decodeString(s): Given an encoded string, return its
 * corresponding decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the
 * square brackets is repeated exactly k times. Note: k is guaranteed to be a
 * positive integer.
 * 
 * For s = "4[ab]", the output should be decodeString(s) = "abababab"
 * 
 * For s ="2[b3[a]]", the output should be decodeString(s) = "baaabaaa"
 * 
 * @author Aishwarya
 *
 */

public class Question2 {

	public static String alteredStr = "";

	public static void main(String[] args) {

		Question2 obj = new Question2();
		// Fetching the string that needs to be decoded
		String inputStr = args[0];
		// String that will have the final decoded String
		String resultStr = "";
		// For every iteration the main input string will be altered.
		alteredStr = inputStr;

		int numOfRepetetionsReq = 0;

		/**
		 * Below for loop will check how many square brackets are present in the string
		 * and accordingly will call the method to decode.
		 */
		for (int a = 0; a < inputStr.length(); a++) {
			char charEle = inputStr.charAt(a);
			if (charEle == "[".charAt(0)) {
				numOfRepetetionsReq++;
			}
		}

		for (int rep = 0; rep < numOfRepetetionsReq; rep++) {
			resultStr = obj.decodeString(alteredStr);
		}

		System.out.println("Final result after functioning : " + resultStr);

	}

	/**
	 * Below method will take in the encodedString and convert it to the expected
	 * format.
	 * 
	 * @param encodedStr
	 * @return decoded string
	 */
	public String decodeString(String encodedStr) {

		String mySubstring = encodedStr.substring(encodedStr.lastIndexOf("[") - 1, encodedStr.indexOf("]") + 1);
		char numberAsStr = mySubstring.charAt(0);

		alteredStr = encodedStr.replace(mySubstring, "");

		int repetetion = Character.getNumericValue(numberAsStr);

		String modifiedStr = mySubstring.substring(mySubstring.lastIndexOf("[") + 1, mySubstring.indexOf("]"));

		String reqStr = "";

		for (int i = 0; i < repetetion; i++) {
			reqStr += modifiedStr;

		}

		if (alteredStr.contains("[")) {
			alteredStr = new StringBuilder(alteredStr).insert(alteredStr.indexOf("]"), reqStr).toString();
		}

		return reqStr;
	}

}