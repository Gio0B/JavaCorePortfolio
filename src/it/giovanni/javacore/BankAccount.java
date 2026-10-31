package it.giovanni.javacore;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double initialBalance) {
		if(owner == null || owner.isBlank()) {
			throw new IllegalArgumentException("Owner cannot be empty");
		}
		
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative");
		}
		
		this.owner = owner;
		this.balance = initialBalance;
	}
	
	public boolean deposit(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("You cannot deposit a negative amount of money or no money at all!");
		}
		
		this.balance = this.balance + amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("You cannot withdraw negative amount of money!");
		}else if (amount > this.balance) {
			throw new IllegalArgumentException("You cannot withdraw more money than you have!");
		}
		
		this.balance = this.balance - amount;
		
		return true;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", balance=" + balance + "]";
	}
	
}
