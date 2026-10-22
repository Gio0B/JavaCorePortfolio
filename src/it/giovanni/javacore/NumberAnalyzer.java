package it.giovanni.javacore;

public class NumberAnalyzer {
	
	//function to check if a number is even
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	//function to see the sum of a number's digits
	public static int sumDigits(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		int sum = 0;
		
		while(n > 0) {
			int x = n % 10;
			sum = sum + x;
			n = n / 10;
		}
		
		return sum;
	}
	
	//function to see how many digits a number have
	public static int countDigits(int n) {
		
		int sum = 0;
		
		if(n == 0) {
			return 1;
		}
		
		while (n > 0) {
			n = n / 10;
			sum ++;
		}
		return sum;
		
	}
	
}
