package org.neutral_networks.staticKeyword;

public class Main {
    public static void main(String[] args) {
        TestClass.setName("Mike");
        // or
        TestClass.name = "Jim";
        TestClass testClass = new TestClass(20, "White");
        //testClass.setName("Mike"); // this is not a right way to set the value to a static variable
        System.out.println("Name: " + testClass.getName());
    }
}
