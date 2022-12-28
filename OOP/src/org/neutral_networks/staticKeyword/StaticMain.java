package org.neutral_networks.staticKeyword;

public class StaticMain {
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



        // why or when we use static type variable or method?
        //|| you may want constant variable in all instances of your class
        // for example: imagine that you are creating a class for simulation different employees of a company
        // inside that class you may have some information about the employee. for example: age, name, email everything but beside
        // all of those you may have field called company name. you know that all instances of your employee class the company name should be the same.

        // for that method you may want to declare your company name as static

        //\\ it is memory friendly
    }
}
