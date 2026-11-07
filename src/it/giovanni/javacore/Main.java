package it.giovanni.javacore;

import java.util.IllegalFormatException;

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
		
		System.out.println("==========================");
		
		//test for arrayAnalizer()
		
		int[] numbers = {4, 8, 2, 8, 10, 3};
		
		System.out.println(ArrayAnalyzer.calculateAverage(numbers));
		System.out.println(ArrayAnalyzer.countOccurrences(numbers, 8));
		System.out.println(ArrayAnalyzer.findMax(numbers));
		System.out.println(ArrayAnalyzer.findMin(numbers));
		
		System.out.println("==========================");
		
		//test BankAccount class
		
		System.out.println("Printing test for BankAccount Class");

		BankAccount account = new BankAccount("Mario", 100.0);

		System.out.println(account.getOwner());
		System.out.println(account.getBalance());

		System.out.println(account.deposit(50));
		System.out.println(account.getBalance());

		System.out.println(account.withdraw(30));
		System.out.println(account.getBalance());
		System.out.println("Final balance: " + account.getBalance());

		// Test invalid operations
		
		try {
			account.withdraw(500);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			account.deposit(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}


		try {
			account.withdraw(-10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			BankAccount testAccount = new BankAccount("", 10.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		testInvalidAccount("", 10);
		testInvalidAccount("Mario", -50);
		testInvalidAccount(null, 100);

		System.out.println(account.toString());

		System.out.println("==========================");
	}
	
	//test bank account with reusable methods
	
	private static void testInvalidAccount(String owner, double balance) {
	    try {
	        BankAccount testAccount = new BankAccount(owner, balance);
	        System.out.println("Account created successfully: " + testAccount);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Account creation failed: " + e.getMessage());
	    }
	}

}
