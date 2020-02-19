package Palindrome.Test;

public class Palindrome {

	public boolean isPalindrome(String originalInput) {
		String reverseInput = "";
		
		for (int i = originalInput.length()-1; i>=0; i--) {
			reverseInput = reverseInput + originalInput.charAt(i);
		}
		if (originalInput.equals(reverseInput)) {
			return true;
		}else {
			return false;
		}
	}
}
