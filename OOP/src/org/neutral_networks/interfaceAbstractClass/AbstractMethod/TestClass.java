package org.neutral_networks.interfaceAbstractClass.AbstractMethod;

public class TestClass extends testAbstractClass { // you can't extends multiple abstract class
    //or, in other word, abstract class does not support multiple inheritance
    @Override
    public void printName(String name) {
        System.out.println("Name: " + name);
    }

    // create constructor via abstract class
    public TestClass(String color) {
        super(color);
    }
}
