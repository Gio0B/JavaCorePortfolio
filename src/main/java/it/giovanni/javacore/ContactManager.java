
package it.giovanni.javacore;

import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {

        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null!");
        }

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(contact.getName())) {
                throw new IllegalArgumentException("Contact name already exists!");
            }

            if (c.getPhoneNumber().equals(contact.getPhoneNumber())) {
                throw new IllegalArgumentException("Phone number already exists!");
            }
        }

        contacts.add(contact);
    }

    // Remove a contact by name
    public void removeContact(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }

        Contact contact = findContactByName(name);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found!");
        }

        contacts.remove(contact);
    }

    // Find a contact by name
    public Contact findContactByName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }

        return null;
    }

    // Find a contact by phone number
    public Contact findContactByPhone(String phoneNumber) {

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid phone number!");
        }

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }

        return null;
    }

    // Update a contact's phone number
    public void updatePhoneNumber(String name, String newPhoneNumber) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (newPhoneNumber == null || newPhoneNumber.isBlank()) {
            throw new IllegalArgumentException("Invalid phone number!");
        }

        Contact contact = findContactByName(name);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found!");
        }

        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(newPhoneNumber)) {
                throw new IllegalArgumentException("Phone number already exists!");
            }
        }

        Contact updatedContact = new Contact(
                contact.getName(),
                newPhoneNumber,
                contact.getEmail()
        );

        contacts.set(contacts.indexOf(contact), updatedContact);
    }

    // Update a contact's email
    public void updateEmail(String name, String newEmail) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (newEmail == null || newEmail.isBlank()) {
            throw new IllegalArgumentException("Invalid email!");
        }

        Contact contact = findContactByName(name);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found!");
        }

        Contact updatedContact = new Contact(
                contact.getName(),
                contact.getPhoneNumber(),
                newEmail
        );

        contacts.set(contacts.indexOf(contact), updatedContact);
    }

    // Get the total number of contacts
    public int getContactCount() {
        return contacts.size();
    }

    // Return a defensive copy of the contact list
    public ArrayList<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
