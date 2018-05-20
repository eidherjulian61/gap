package com.gap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindromeShouldReturnTrue() {
		boolean result = Palindrome.isPalindrome("A nut for a jar of tuna");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnFalse() {
		boolean result = Palindrome.isPalindrome("This is not a palindrome string");
		assertThat(result, is(equalTo(false)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue2() {
		boolean result = Palindrome.isPalindrome("Able was I ere I saw Elba");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue3() {
		boolean result = Palindrome.isPalindrome("A man, a plan, a canal – Panama");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue4() {
		boolean result = Palindrome.isPalindrome("Madam, I'm Adam");
		assertThat(result, is(equalTo(true)));
	}

	@Test
	public void testIsPalindromeShouldReturnTrue5() {
		boolean result = Palindrome.isPalindrome("Never odd or even");
		assertThat(result, is(equalTo(true)));
	}

}
