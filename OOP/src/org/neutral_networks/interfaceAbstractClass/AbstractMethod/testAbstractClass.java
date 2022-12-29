package org.neutral_networks.interfaceAbstractClass.AbstractMethod;

public abstract class testAbstractClass {

    public abstract void printName(String name);

    //
    private String color;

    public testAbstractClass(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // create simple method inside abstract class
    // or non-abstract field able to create
    public void printColor() {
        System.out.println("Color: "+ this.getColor());
    }
}
