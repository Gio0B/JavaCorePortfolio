
package it.giovanni.javacore;

import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {

        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null!");
        }

        for (Contact contactList : contacts) {

            if (contactList.getName().equals(contact.getName())
                    || contactList.getPhoneNumber().equals(contact.getPhoneNumber())) {

                throw new IllegalArgumentException(
                    "This person or this number is already in your contact list!");
            }
        }

        contacts.add(contact);
    }

    public void removeContact(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Insert a valid name!");
        }

        Contact contact = findContactByName(name);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found!");
        }

        contacts.remove(contact);
    }

    public Contact findContactByName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Insert a valid name!");
        }

        for (Contact contact : contacts) {

            if (contact.getName().equals(name)) {
                return contact;
            }
        }

        return null;
    }

    public Contact findContactByPhone(String phoneNumber) {

        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Insert a valid phone number!");
        }

        for (Contact contact : contacts) {

            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }

        return null;
    }

    public void updatePhoneNumber(String name, String newPhone) {

        if (name == null || name.isBlank()
                || newPhone == null || newPhone.isBlank()) {

            throw new IllegalArgumentException("Invalid name or phone number!");
        }

        for (Contact contact : contacts) {

            if (contact.getName().equals(name)) {

                for (Contact other : contacts) {

                    if (!other.getName().equals(name)
                            && other.getPhoneNumber().equals(newPhone)) {

                        throw new IllegalArgumentException(
                            "This phone number is already taken!");
                    }
                }

                contact.setPhoneNumber(newPhone);
                return;
            }
        }

        throw new IllegalArgumentException("Contact not found!");
    }

    public int getContactCount() {
        return contacts.size();
    }

    public ArrayList<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
