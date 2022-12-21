package org.neutral_networks.opp1;

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

        contactList.setEmail("martinez@yahoo.net");
        String email = contactList.getEmail();
        System.out.println("Email: " + email);

    }
}
