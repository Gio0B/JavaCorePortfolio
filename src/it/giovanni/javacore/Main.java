package it.giovanni.javacore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Core Portfolio - Hello World!");
		
		//Testing fizzBuzz() Class
		System.out.println("Printing test for FizzBuzz Class");
		FizzBuzz.fizzBuzz(15);
		System.out.println("==========================");
		
		//Testing NumberAnalyzer Class
		
		System.out.println("Printing test for NumberAnalyzer Class");
		
		//test for isEven()
		System.out.println(NumberAnalyzer.isEven(2));
		System.out.println(NumberAnalyzer.isEven(3));
		
		//test for sumDigits()
		System.out.println(NumberAnalyzer.sumDigits(0));
		System.out.println(NumberAnalyzer.sumDigits(12));
		System.out.println(NumberAnalyzer.sumDigits(345));
		
		//test for countDigits()
		System.out.println(NumberAnalyzer.countDigits(0));
		System.out.println(NumberAnalyzer.countDigits(14));
		System.out.println(NumberAnalyzer.countDigits(9860));
		
		System.out.println("==========================");
		
		//test for palindromeChecker()
		
		System.out.println("Printing test for PalindromeChecker Class");
		
		System.out.println(PalindromeChecker.palindromeChecker("anna"));
		System.out.println(PalindromeChecker.palindromeChecker("home"));
		System.out.println(PalindromeChecker.palindromeChecker("Radar"));
		
		
	}

}
