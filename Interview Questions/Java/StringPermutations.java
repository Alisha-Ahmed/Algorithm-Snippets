package com.opensource.interview;

public class StringPermutations {

	public static void main(String[] args) {

		String str = "abc";
		String result = "";

		printPermutation(str, result);
	}

	public static void printPermutation(String str, String result) {

		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			String before = str.substring(0, i);
			String after = str.substring(i + 1);
			String rest = before + after;

			printPermutation(rest, result + current);
		}
	}
}


/* output:
abc
acb
bac
bca
cab
cba
*/


// Additional reference: 
// https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

