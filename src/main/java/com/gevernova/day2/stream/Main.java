package com.gevernova.day2.stream;
import java.util.*;

public class Main {

    // stores multiple address books
    private static Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBookMap.put("Default", addressBook);

        while (true) {

            // main menu
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Contact to Book");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View Contacts");
            System.out.println("5. Add multiple AddressBooks");
            System.out.println("6. Search Person by location");
            System.out.println("7. View Persons by location");
            System.out.println("8. Count Persons by location");
            System.out.println("9. Sort entries by Person's name");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // add new contact
                    System.out.println("Enter First Name:");
                    String fn = sc.next();
                    System.out.println("Enter Last Name:");
                    String ln = sc.next();
                    System.out.println("Enter Address:");
                    String address = sc.next();
                    System.out.println("Enter City:");
                    String city = sc.next();
                    System.out.println("Enter State:");
                    String state = sc.next();
                    System.out.println("Enter Email:");
                    String email = sc.next();
                    System.out.println("Enter Zip:");
                    int zip = sc.nextInt();
                    System.out.println("Enter Phone Number:");
                    long phone = sc.nextLong();

                    addressBook.addContact(
                            new Contact(fn, ln, address, city, state, email, zip, phone)
                    );
                    break;

                case 2:
                    // edit existing contact
                    System.out.println("Enter First Name to Edit:");
                    addressBook.editContact(sc.next(), sc);
                    break;

                case 3:
                    // delete contact
                    System.out.println("Enter First Name to Delete:");
                    addressBook.deleteContact(sc.next());
                    break;

                case 4:
                    // view all contacts
                    addressBook.viewContacts();
                    break;

                case 5:
                    // create new address book
                    System.out.println("Enter AddressBook Name:");
                    String name = sc.next();
                    addressBookMap.put(name, new AddressBook());
                    System.out.println("AddressBook created.");
                    break;

                case 6:
                    // search by city or state
                    System.out.println("Enter City or State:");
                    addressBook.searchByLocation(sc.next());
                    break;

                case 7:
                    // view persons by location
                    System.out.println("Enter City or State:");
                    addressBook.viewByLocation(sc.next());
                    break;

                case 8:
                    // count persons by location
                    System.out.println("Enter City or State:");
                    addressBook.countByLocation(sc.next());
                    break;

                case 9:
                    // sort contacts by name
                    addressBook.sortByName();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
