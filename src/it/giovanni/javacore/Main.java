package it.giovanni.javacore;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
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
		
		testInvalidAccount("", 10);
		testInvalidAccount("Mario", -50);
		testInvalidAccount(null, 100);

		System.out.println(account.toString());

		System.out.println("==========================");
		
		StudentManager manager = new StudentManager();

		//test class
		
		// Adding students
		manager.addStudent("Mario");
		manager.addStudent("Luke");
		manager.addStudent("Anne");

		System.out.println("Student count: " + manager.getStudentCount());
		// Expected: 3

		// Checking students' presence
		System.out.println("Luke exists: " + manager.containsStudent("Luke"));
		// Expected: true

		System.out.println("Paul exists: " + manager.containsStudent("Paul"));
		// Expected: false

		// Removing a student
		manager.removeStudent("Luke");

		System.out.println("Student count after removal: " + manager.getStudentCount());
		// Expected: 2

		// Printing list
		System.out.println("Students: " + manager.getAllStudents());
		// Expected: [Mario, Anne]
		
		//Exception handling tests
		
		// Try to add an empty name
		try {
		    manager.addStudent("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty name rejected: " + e.getMessage());
		}

		// Try to add a null name
		try {
		    manager.addStudent(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null name rejected: " + e.getMessage());
		}

		// Try to add a duplicate student
		try {
		    manager.addStudent("Mario");
		} catch (IllegalArgumentException e) {
		    System.out.println("Duplicate student rejected: " + e.getMessage());
		}

		// Try to remove a non-existent student
		try {
		    manager.removeStudent("Paolo");
		} catch (IllegalArgumentException e) {
		    System.out.println("Non-existent student rejected: " + e.getMessage());
		}

		// Try to search with an invalid name
		try {
		    manager.containsStudent(" ");
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid search rejected: " + e.getMessage());
		}
		
		// List copy test
		
		// Get a copy of the student list
		ArrayList<String> copy = manager.getAllStudents();

		// Modify the copied list
		copy.clear();

		System.out.println("Modified copy: " + copy);
		// Expected: []

		System.out.println("Original list: " + manager.getAllStudents());
		// Expected: [Mario, Anna]

		System.out.println("Original student count: " + manager.getStudentCount());
		// Expected: 2
		
		//Empty list test
		
		// Create a new empty StudentManager
		StudentManager emptyManager = new StudentManager();

		System.out.println("Empty list count: " + emptyManager.getStudentCount());
		// Expected: 0

		System.out.println("Mario exists: " + emptyManager.containsStudent("Mario"));
		// Expected: false

		System.out.println("Empty student list: " + emptyManager.getAllStudents());
		// Expected: []
		
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
