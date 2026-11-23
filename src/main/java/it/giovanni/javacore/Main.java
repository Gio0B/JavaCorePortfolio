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
		
		// Test deposit overflow
		try {
		    BankAccount account2 = new BankAccount("Test", Double.MAX_VALUE);
		    account2.deposit(Double.MAX_VALUE);
		} catch (IllegalArgumentException e) {
		    System.out.println("Deposit overflow rejected: " + e.getMessage());
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
		
		System.out.println("==========================");
		
		//Testing Contact and ContactManager
		
		System.out.println("Testing Contact and ContactManager");
		
		// Create a new contact manager
		ContactManager contactManager = new ContactManager();

		// Create contacts
		Contact contact1 = new Contact("Mario Rossi", "333111222", "mario@email.com");
		Contact contact2 = new Contact("Luca Bianchi", "333444555", "luca@email.com");
		Contact contact3 = new Contact("Anna Verdi", "333666777", "anna@email.com");

		// Add contacts to the manager
		contactManager.addContact(contact1);
		contactManager.addContact(contact2);
		contactManager.addContact(contact3);

		System.out.println("Initial contact count: " + contactManager.getContactCount());
		// Expected: 3

		System.out.println("All contacts: " + contactManager.getAllContacts());
		// Expected: All three contacts
		
		// Search for an existing contact by name
		System.out.println("Search by name: " + contactManager.findContactByName("Mario Rossi"));
		// Expected: Contact [name=Mario Rossi, phoneNumber=333111222, email=mario@email.com]

		// Search for a non-existent contact by name
		System.out.println("Search for missing contact: " + contactManager.findContactByName("Paolo Neri"));
		// Expected: null

		// Search for an existing contact by phone number
		System.out.println("Search by phone: " + contactManager.findContactByPhone("333444555"));
		// Expected: Luca Bianchi

		// Search for a non-existent phone number
		System.out.println("Search for missing phone: " + contactManager.findContactByPhone("000000000"));
		// Expected: null
		
		// Update an existing contact's phone number
		contactManager.updatePhoneNumber("Mario Rossi", "333999888");

		System.out.println("Updated contact: " + contactManager.findContactByName("Mario Rossi"));
		// Expected: Mario Rossi, phoneNumber=333999888

		// Verify the new phone number
		System.out.println("Search using new phone: " + contactManager.findContactByPhone("333999888"));
		// Expected: Mario Rossi

		// Verify the old phone number is no longer assigned
		System.out.println("Search using old phone: " + contactManager.findContactByPhone("333111222"));
		// Expected: null
		
		// Remove an existing contact
		contactManager.removeContact("Luca Bianchi");

		System.out.println("Contact count after removal: " + contactManager.getContactCount());
		// Expected: 2

		System.out.println("Search removed contact: " + contactManager.findContactByName("Luca Bianchi"));
		// Expected: null

		System.out.println("Remaining contacts: " + contactManager.getAllContacts());
		// Expected: Mario Rossi and Anna Verdi
		
		// Try to add a contact with an existing name
		try {
			contactManager.addContact(new Contact("Mario Rossi", "333000111", "new@email.com"));
		} catch (IllegalArgumentException e) {
		    System.out.println("Duplicate name rejected: " + e.getMessage());
		}

		// Try to add a contact with an existing phone number
		try {
			contactManager.addContact(new Contact("Giulia Neri", "333999888", "giulia@email.com"));
		} catch (IllegalArgumentException e) {
		    System.out.println("Duplicate phone number rejected: " + e.getMessage());
		}

		// Try to add a null contact
		try {
			contactManager.addContact(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null contact rejected: " + e.getMessage());
		}
		
		// Try to search using an empty name
		try {
			contactManager.findContactByName("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty name rejected: " + e.getMessage());
		}

		// Try to search using a null name
		try {
			contactManager.findContactByName(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null name rejected: " + e.getMessage());
		}

		// Try to search using an empty phone number
		try {
			contactManager.findContactByPhone("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty phone number rejected: " + e.getMessage());
		}

		// Try to search using a null phone number
		try {
			contactManager.findContactByPhone(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null phone number rejected: " + e.getMessage());
		}
		
		// Try to update a non-existent contact
		try {
			contactManager.updatePhoneNumber("Unknown Contact", "333123456");
		} catch (IllegalArgumentException e) {
		    System.out.println("Missing contact update rejected: " + e.getMessage());
		}

		// Try to assign an already existing phone number
		try {
			contactManager.updatePhoneNumber("Mario Rossi", "333666777");
		} catch (IllegalArgumentException e) {
		    System.out.println("Duplicate phone update rejected: " + e.getMessage());
		}

		// Try to update using an empty phone number
		try {
			contactManager.updatePhoneNumber("Mario Rossi", "");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty phone number rejected: " + e.getMessage());
		}

		// Try to update using a null phone number
		try {
			contactManager.updatePhoneNumber("Mario Rossi", null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null phone number rejected: " + e.getMessage());
		}
		
		// Get a copy of the contact list
		ArrayList<Contact> contactCopy = contactManager.getAllContacts();

		// Clear the copied list
		contactCopy.clear();

		System.out.println("Copied list after clearing: " + contactCopy);
		// Expected: []

		System.out.println("Original contact count: " + contactManager.getContactCount());
		// Expected: 2

		System.out.println("Original contact list: " + contactManager.getAllContacts());
		// Expected: Mario Rossi and Anna Verdi
		
		// Try to create a contact with an empty name
		try {
		    new Contact("", "333111222", "test@email.com");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty contact name rejected: " + e.getMessage());
		}

		// Try to create a contact with a null phone number
		try {
		    new Contact("Test User", null, "test@email.com");
		} catch (IllegalArgumentException e) {
		    System.out.println("Null contact phone rejected: " + e.getMessage());
		}

		// Try to create a contact with an empty email
		try {
		    new Contact("Test User", "333111222", "");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty contact email rejected: " + e.getMessage());
		}

		// Test phone number validation
		// Test phone number validation
		try {
		    contactManager.updatePhoneNumber("Mario Rossi", "");
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid phone number rejected: " + e.getMessage());
		}

		// Test email validation
		try {
		    contactManager.updateEmail("Mario Rossi", null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid email rejected: " + e.getMessage());
		}
		
		System.out.println("==========================");
		
		//Testing for Product and InventoryManager classes
		
		System.out.println("Testing Product and InventoryManager\n");

		InventoryManager inventory = new InventoryManager();

		Product product1 = new Product("P001", "Laptop", 899.99, 5);
		Product product2 = new Product("P002", "Mouse", 24.99, 20);
		Product product3 = new Product("P003", "Keyboard", 59.99, 10);
		Product product4 = new Product("P004", "Monitor", 199.99, 0);

		inventory.addProduct(product1);
		inventory.addProduct(product2);
		inventory.addProduct(product3);
		inventory.addProduct(product4);

		System.out.println("Initial product count: " + inventory.getTotalProducts());
		// Expected: 4

		System.out.println("All products: " + inventory.getAllProducts());
		// Expected: all four products
		
		System.out.println("\n--- Search tests ---");

		System.out.println("Search by ID: " + inventory.findProductById("P001"));
		// Expected: Laptop

		System.out.println("Search by name: " + inventory.findProductByName("Mouse"));
		// Expected: Mouse

		System.out.println("Search missing ID: " + inventory.findProductById("P999"));
		// Expected: null

		System.out.println("Search missing name: " + inventory.findProductByName("Tablet"));
		// Expected: null
		
		System.out.println("\n--- Update tests ---");

		inventory.updateProductPrice("P001", 999.99);

		System.out.println("Updated product price: " + inventory.findProductById("P001"));
		// Expected: price=999.99

		inventory.updateProductQuantity("P002", 30);

		System.out.println("Updated product quantity: " + inventory.findProductById("P002"));
		// Expected: quantity=30

		inventory.updateProductQuantity("P004", 10);

		System.out.println("Updated zero quantity product: " + inventory.findProductById("P004"));
		// Expected: quantity=10
		
		System.out.println("\n--- Removal tests ---");

		inventory.removeProduct("P003");

		System.out.println("Product count after removal: " + inventory.getTotalProducts());
		// Expected: 3

		System.out.println("Search removed product: " + inventory.findProductById("P003"));
		// Expected: null

		System.out.println("Remaining products: " + inventory.getAllProducts());
		// Expected: Laptop, Mouse, Monitor
		
		System.out.println("\n--- Invalid insertion tests ---");

		try {
		    inventory.addProduct(new Product("P001", "New Laptop", 500.00, 3));
		} catch (IllegalArgumentException e) {
		    System.out.println("Duplicate ID rejected: " + e.getMessage());
		}

		try {
		    inventory.addProduct(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null product rejected: " + e.getMessage());
		}
		
		System.out.println("\n--- Invalid search tests ---");

		try {
		    inventory.findProductById("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty ID rejected: " + e.getMessage());
		}

		try {
		    inventory.findProductById(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null ID rejected: " + e.getMessage());
		}

		try {
		    inventory.findProductByName("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty name rejected: " + e.getMessage());
		}

		try {
		    inventory.findProductByName(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null name rejected: " + e.getMessage());
		}
		
		System.out.println("\n--- Invalid update tests ---");

		try {
		    inventory.updateProductPrice("P999", 100.00);
		} catch (IllegalArgumentException e) {
		    System.out.println("Missing product price update rejected: " + e.getMessage());
		}

		try {
		    inventory.updateProductQuantity("P999", 10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Missing product quantity update rejected: " + e.getMessage());
		}

		try {
		    inventory.updateProductPrice("P001", -10);
		} catch (IllegalArgumentException e) {
		    System.out.println("Negative price rejected: " + e.getMessage());
		}

		try {
		    inventory.updateProductPrice("P001", Double.NaN);
		} catch (IllegalArgumentException e) {
		    System.out.println("NaN price rejected: " + e.getMessage());
		}

		try {
		    inventory.updateProductPrice("P001", Double.POSITIVE_INFINITY);
		} catch (IllegalArgumentException e) {
		    System.out.println("Infinite price rejected: " + e.getMessage());
		}

		try {
		    inventory.updateProductQuantity("P001", -5);
		} catch (IllegalArgumentException e) {
		    System.out.println("Negative quantity rejected: " + e.getMessage());
		}
		
		System.out.println("\n--- Invalid removal tests ---");

		try {
		    inventory.removeProduct("P999");
		} catch (IllegalArgumentException e) {
		    System.out.println("Missing product removal rejected: " + e.getMessage());
		}

		try {
		    inventory.removeProduct("");
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty ID removal rejected: " + e.getMessage());
		}

		try {
		    inventory.removeProduct(null);
		} catch (IllegalArgumentException e) {
		    System.out.println("Null ID removal rejected: " + e.getMessage());
		}
		
		System.out.println("\n--- Product validation tests ---");

		try {
		    new Product("", "Laptop", 500.00, 5);
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty product ID rejected: " + e.getMessage());
		}

		try {
		    new Product("P010", "", 500.00, 5);
		} catch (IllegalArgumentException e) {
		    System.out.println("Empty product name rejected: " + e.getMessage());
		}

		try {
		    new Product("P010", "Laptop", -10, 5);
		} catch (IllegalArgumentException e) {
		    System.out.println("Negative product price rejected: " + e.getMessage());
		}

		try {
		    new Product("P010", "Laptop", 500, -1);
		} catch (IllegalArgumentException e) {
		    System.out.println("Negative product quantity rejected: " + e.getMessage());
		}

		try {
		    new Product("P010", "Laptop", Double.NaN, 5);
		} catch (IllegalArgumentException e) {
		    System.out.println("NaN constructor price rejected: " + e.getMessage());
		}

		try {
		    product1.setPrice(0);
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid setter price rejected: " + e.getMessage());
		}

		try {
		    product1.setQuantity(-1);
		} catch (IllegalArgumentException e) {
		    System.out.println("Invalid setter quantity rejected: " + e.getMessage());
		}
		
		System.out.println("\n--- Inventory value test ---");

		System.out.println("Total inventory value: " + inventory.getTotalInventoryValue());
		// Expected: 899.99 * 5 + 24.99 * 30 + 199.99 * 10
		// Expected: 7749.55
		
		
		System.out.println("\n--- Defensive copy test ---");

		ArrayList<Product> productCopy = inventory.getAllProducts();

		productCopy.clear();

		System.out.println("Copied list after clearing: " + productCopy);
		// Expected: []

		System.out.println("Original product count: " + inventory.getTotalProducts());
		// Expected: 3

		System.out.println("Original product list: " + inventory.getAllProducts());
		// Expected: original products still present
		
		
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
