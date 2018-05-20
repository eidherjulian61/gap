package com.gap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindromeShouldReturnTrue() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("A nut for a jar of tuna");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnFalse() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("This is not a palindrome string");
		assertThat(result, is(equalTo(false)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue2() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("Able was I ere I saw Elba");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue3() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("A man, a plan, a canal – Panama");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue4() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("Madam, I'm Adam");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue5() {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome("Never odd or even");
		assertThat(result, is(equalTo(true)));
	}

}
