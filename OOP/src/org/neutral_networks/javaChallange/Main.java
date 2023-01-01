package org.neutral_networks.javaChallange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts;
    private static Scanner scanner;

    // unique id, for every message create id is increment by 1 and thus number of the id is to be unique
    private static int id = 0;

    public static void main(String[] args) {
        /**
         * Simulate your phone's contact and messages applications
         *
         * Greet the user
         * Show these 3 options: 1. Manage contacts     2. Messages     3. Quit
         * In case of selection 1 --> show these options:
         *         1. Show all contacts
         *         2. Add a new contact
         *         3. Search for a contact
         *         4. Delete a contact
         *         5. Go back to the previous menu
         * In case of 2  --> Show these options:
         *         1. See the list of all messages
         *         2. Send a new message
         *         3. Go back to the previous menu
         * In case of 3  --> Quit the application
         */


        contacts = new ArrayList<>();
        System.out.println("Welcome to my funny world of programming");
        showInitialOptions();
    }

    private static void showInitialOptions() {
        System.out.println("Please select one:" +
                           "\n\t1. Manage Contacts" +
                           "\n\t2. Messages" +
                           "\n\t3. Quit");

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.println("Please select one:" +
                           "\n\t1. Show all contacts" +
                           "\n\t2. Add a new contact" +
                           "\n\t3. Search for a contact" +
                           "\n\t4. Delete a contact" +
                           "\n\t5. Go back to the previous menu");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContacts();
                break;
            case 3:
                searchForContacts();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void manageMessages() {
        System.out.println("Please select one:" +
                "\n\t1. Show all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go Back");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send a message?");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("Please enter the name of the contact");
            sendNewMessage();
        } else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("What are you going to say?");
                String text = scanner.next();

                if (text.equals("")) {
                    System.out.println("Please enter some message");
                    sendNewMessage();
                } else {
                    id++; //for every message create id is increment by 1 and thus number of the id is to be unique

                    // create message object
                    Message newMessage = new Message(text, name, id);

                    // need to expand the feature when you send large amount of word to a user
                    for (Contact c: contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Message> newMessages = c.getMessages();
                            newMessages.add(newMessage);

                            // save this current contact
                            Contact currentContact = c;
                            currentContact.setMessages(newMessages);
                            contacts.remove(c);
                            contacts.add(currentContact);
                        }
                    }
                }
            } else {
                System.out.println("There is no such contact");
            }
        }

        showInitialOptions();
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.size() > 0) {
            for (Message m: allMessages) {
                m.getDetails();
                System.out.println("*********");
            }
        } else {
            System.out.println("You don't have any message");
        }

        showInitialOptions();
    }

    private static void deleteContact() {
        System.out.println("Please enter the name:");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("!Please enter the name");
            deleteContact();
        } else {
            boolean doesExist = false;
            /*
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    contacts.remove(c);

                }
                break;
            }*/
            // solve ConcurrentModificationException here (for loop)
            for (Iterator<Contact> c = contacts.iterator(); c.hasNext();) {
                Contact c_contacts = c.next();
                if (c_contacts.getName().equals(name)) {
                    doesExist = true;
                    c.remove();
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        }

        showInitialOptions();
    }

    private static void searchForContacts() {
        System.out.println("Please enter the contact name:");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the name:");
            searchForContacts();
        } else {
            boolean doesExist = false;

            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact in your phone");
            }
        }
        showInitialOptions();
    }

    private static void addNewContacts() {
        System.out.println("Adding new contact..." +
                           "\nPlease enter the contact's name:");
        String name = scanner.next();
        System.out.println("Please enter contact's number:");
        String number = scanner.next();
        System.out.println("Please enter the contact's email:");
        String email = scanner.next();

        // check if any given input field is null or empty
        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("Please enter all of the information's");
            addNewContacts();
        } else {
            // check if given contact is already in our contact list or not
            boolean doesExist = false;
            for(Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("We have a contact named " + name + " saved on this device");
                addNewContacts();
            } else {
                Contact contact = new Contact(name, number ,email);
                contacts.add(contact);

                System.out.println(name + " added successfully");
            }
        }

        showInitialOptions();
    }

    private static void showAllContacts() {
        if (contacts.size() > 0) {
            for (Contact c: contacts) {
                c.getDetails();
                System.out.println("************");
            }
            showInitialOptions();
        } else {
            System.out.println("You do not have any contact");
            showInitialOptions();
        }
    }

}
