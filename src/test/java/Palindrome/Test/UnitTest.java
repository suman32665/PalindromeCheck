package Palindrome.Test;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest extends Palindrome {

	@Test
	public void PalindromeTest() {
		Assert.assertTrue(isPalindrome("11011"));
		Assert.assertFalse(isPalindrome("110111"));
	}
}
