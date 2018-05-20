package com.gap;

public class Palindrome {

	public static boolean isPalindrome(String text) {
		String input = text.replaceAll("[^A-Za-z0-9]", "");
		StringBuilder reversedString = new StringBuilder(input).reverse();
		boolean result = reversedString.toString().equalsIgnoreCase(input);
		return result;
	}

}
