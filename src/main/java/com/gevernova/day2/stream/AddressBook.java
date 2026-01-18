package com.gevernova.day2.stream;

import java.util.*;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    // 1. Add Contact (with duplicate check)
    public void addContact(Contact contact) {
        for (Contact c : contactList) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName()) &&
                    c.getLastName().equalsIgnoreCase(contact.getLastName())) {
                System.out.println("Contact already exists.");
                return;
            }
        }
        contactList.add(contact);
        System.out.println("Contact added successfully.");
    }

    // 2. Edit Contact (by first name)
    public void editContact(String firstName, Scanner sc) {
        for (Contact c : contactList) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Enter new City:");
                c.setCity(sc.next());
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // 3. Delete Contact
    public void deleteContact(String firstName) {
        Iterator<Contact> it = contactList.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // 4. View Contacts
    public void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    // 6. Search by City or State
    public void searchByLocation(String location) {
        for (Contact c : contactList) {
            if (c.getCity().equalsIgnoreCase(location) ||
                    c.getState().equalsIgnoreCase(location)) {
                System.out.println(c);
            }
        }
    }

    // 7. View by City or State
    public void viewByLocation(String location) {
        searchByLocation(location);
    }

    // 8. Count by City or State
    public void countByLocation(String location) {
        int count = 0;
        for (Contact c : contactList) {
            if (c.getCity().equalsIgnoreCase(location) ||
                    c.getState().equalsIgnoreCase(location)) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    // 9. Sort by First Name
    public void sortByName() {
        contactList.sort(Comparator.comparing(Contact::getFirstName));
        System.out.println("Contacts sorted by name.");
    }
}







    /*new Comparator<Contact>() {
        public int compare(Contact c1, Contact c2) {
            return c1.getFirstName().compareTo(c2.getFirstName());
        }
    };*/

