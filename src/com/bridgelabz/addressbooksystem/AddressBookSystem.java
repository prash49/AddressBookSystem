package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
    static class AddressBook {
        // we created a variable contacts ,array of type ContactsBook
        private List<ContactsBook> contacts;

        public AddressBook(List<ContactsBook> contacts) {
            this.contacts = contacts;
        }

        // using to getter and setter method to access the private variable
        public List<ContactsBook> getContacts() {
            return contacts;
        }

        // we using constructor to set the value to it so setter method is not necessary
        public void setContacts(List<ContactsBook> contacts) {
            this.contacts = contacts;
        }
    }

    // method with type AddressBook and parameter addressBook
    public static void displayContacts(AddressBook addressBook) {
        // getter method to get values from AddressBook
        // contactsBookList is variable here to store data from AddressBook contacts
        List<ContactsBook> contactsBookList = addressBook.getContacts();
        // to print array we need to use For loop
        for (int i = 0; i < contactsBookList.size(); i++) {
            // each List values store in contactPerson variable
            // ContactsBook method is non-static so we need a variable to access
            ContactsBook contactPerson = contactsBookList.get(i);
            System.out.println("Contact Details :");
            System.out.println("FirstName :" + contactPerson.getFirstName().toUpperCase() + "     LastName :" + contactPerson.getLastName().toUpperCase()
                    + "     Address :" + contactPerson.getAddress() + "      City :" + contactPerson.getCity()
                    + "   State :" + contactPerson.getState() + "     Zip :" + contactPerson.getZip() + "     Phone Number :" + contactPerson.getPhone());

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ");
        Scanner sc = new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter the First Name");
        String firstName = sc.next();
        System.out.println("Enter the Last Name");
        String lastName = sc.next();
        System.out.println("Enter The Address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter the Phone number");
        long phone = sc.nextLong();
        // creating Arraylist with variable name contactList
        List<ContactsBook> contactList = new ArrayList<>();
        // creating object to call ContactsBook class with parameters and assigning to the constructor
        ContactsBook contact = new ContactsBook(firstName, lastName, address, city, state, zip, phone);
        // adding the data into arraylist using .add
        contactList.add(contact);
        // creating object to call AddressBook class and initialising data
        AddressBook addressBook = new AddressBook(contactList);
        // to set data into addressBook array
        // addressBook.setContacts(contactList);
        // calling display method to print
        displayContacts(addressBook);

    }
}
