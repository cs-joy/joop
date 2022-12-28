package org.neutral_networks.staticKeyword;

public class TestClass {
    public static String name;
    public int age;
    public String skinColor;

    public TestClass(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public void print() {
        System.out.println("print");
    }

    // static method
    public static void printSomething() {
        System.out.println("Printing....");
        //print(); // Non-static method 'print()' cannot be referenced from a static context
        //System.out.println(age); // Non-static field 'age' cannot be referenced from a static context
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
