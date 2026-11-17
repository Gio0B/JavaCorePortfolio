package it.giovanni.javacore;

public class Contact {
	
	private String name;
	private String phoneNumber;
	private String email;
	
	public Contact(String name, String phoneNumber, String email) {
		
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("The contact has to have a name!");
		}else if (phoneNumber == null || phoneNumber.isBlank()) {
			throw new IllegalArgumentException("The contact has to have a phone number!");
		}else if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("The contact has to have an email!");
		}
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		
		if (phoneNumber == null || phoneNumber.isBlank()) {
			throw new IllegalArgumentException("The contact has to have a phone number!");
		}
		
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("The contact has to have an email!");
		}
		
		this.email = email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	
}
