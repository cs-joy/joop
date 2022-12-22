package org.neutral_networks.opp1;

import org.neutral_networks.ie.Recursion;
import org.neutral_networks.ie.arrayRecursion;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.name = "iPhone 11";

        System.out.println(iPhone.name);

        iPhone.camera = 1024;
        System.out.println(iPhone.camera);

        // call method
        iPhone.playMusic("Our wings are burning");
        iPhone.playMusic("Lamenting Kiss");

        // private variable and method
        //iPhone.price = 10000 // it's not allowed here because of private access specifier
        //int price = iPhone.getPrice(10000);
        //System.out.println(price);

        iPhone.setPrice(1500);
        System.out.println(iPhone.getPrice());


        System.out.println("\n\n---\n\tprivateAS");
        // create object
        privateAS contactList = new privateAS();

        contactList.setContactName("Md. Zahangir Alam");
        String user = contactList.getContactname();
        System.out.println("Name: " + user);

        contactList.setNetwork("Grammeenphone");
        String network = contactList.getNetwork();
        System.out.println("Network: " + network);

        contactList.setNetworkCode(017);
        int code = contactList.getNetworkCode();
        System.out.println("Code: " + code);

        contactList.setNumber("+8801773546429");
        String myNumber = contactList.getNumber();
        System.out.println("Number: " + myNumber);

        contactList.setEmail("martinez@yahoo.net");
        String email = contactList.getEmail();
        System.out.println("Email: " + email);


        System.out.println("\n\tConstructor");
        Books library = new Books("Physical Chemistry", "Chemistry", "04S234F79", "Peterson", "Pharmacy");
        System.out.println("\t---Book List---");
        System.out.println("Name: " + library.getBookName());
        System.out.println("Category: " + library.getBookCategory());
        System.out.println("Accession: " + library.getAccessNumber());
        System.out.println("Author: " + library.getBookAuthor());
        System.out.println("Department: " + library.getBooksDepartment());

        System.out.println("\tSecond Constructor with two parameter");
        Books info = new Books("Discrete Mathematics", "Roggen Pearson");
        System.out.println("Book Name: " + info.getBookName());
        System.out.println("Book Author: " + info.getBookAuthor());


        System.out.println("\n\tRecursion");
        Recursion recursion = new Recursion();

        int num = 10;
        recursion.setNumber(num);
        int result = recursion.getNumber();
        System.out.println("summation of " + num + " is= " + result);

        System.out.println("\t\tArrayAdd");
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayRecursion myObj = new arrayRecursion();
        int res = myObj.sumofArrayElements(myNumbers);
        System.out.println(res);


    }
}
