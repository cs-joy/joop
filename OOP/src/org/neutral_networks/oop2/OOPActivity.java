package org.neutral_networks.oop2;

public class OOPActivity {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Nina", "Golden", 2, true, 2);

        // print the name of the bird
        System.out.println("Name: " + phoenix.getName());

        // access method of parent class (here Animal)
        phoenix.eat("Meat");

        //
        System.out.println("Wings: " + phoenix.getWings());

        // access new method of the child class(here Bird)
        phoenix.fly();

    }
}
