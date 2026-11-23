
package it.giovanni.javacore;

public class Contact {

    private final String name;
    private final String phoneNumber;
    private final String email;

    public Contact(String name, String phoneNumber, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid phone number!");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Invalid email!");
        }

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name
                + ", phoneNumber=" + phoneNumber
                + ", email=" + email + "]";
    }
}
