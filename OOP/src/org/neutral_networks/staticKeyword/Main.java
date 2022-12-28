package org.neutral_networks.staticKeyword;

public class Main {
    public static void main(String[] args) {
        // when we declare a variable is static type and after that when we call the variable or method we do not have need to create object to call the function or variable
        // for example:

        TestClass.setName("Mike"); // here is setName() is a static type method
        // or
        //TestClass.name = "Jim"; // here is name variable is static type
        // that is why we can access it directly without create object of the class

        
        TestClass testClass = new TestClass(20, "White");
        //testClass.setName("Mike"); // this is not a right way to set the value to a static variable
        System.out.println("Name: " + testClass.getName());

        // create another object
        TestClass secObj = new TestClass(27, "Black");
        System.out.println(secObj.name); // Mike is printed


        // call the static method
        TestClass.printSomething();
    }
}
