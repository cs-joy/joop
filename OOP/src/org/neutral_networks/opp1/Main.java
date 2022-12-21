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
    }
}
