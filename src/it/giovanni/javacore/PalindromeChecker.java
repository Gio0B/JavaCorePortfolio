package it.giovanni.javacore;

public class PalindromeChecker {
	
	public static boolean palindromeChecker(String word) {
		
		// Using toLowerCase() allows the user to enter words with uppercase letters.
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length() / 2; i++) {
	        // Checking the character at i position
			if(word.charAt(i) != word.charAt(word.length() -1 -i)) {
				return false;
			}
	    }
		
		return true;
	}

}
