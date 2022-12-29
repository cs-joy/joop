package org.neutral_networks.interfaceAbstractClass.AbstractMethod;

public class Main {
    public static void main(String[] args) {
        testAbstractClass obj = new TestClass("skyblue");
        // access method from "TestClass"
        obj.printName("Meisam");

        // access method from the abstract class "testAbstractClass"
        obj.printColor();
    }
}
