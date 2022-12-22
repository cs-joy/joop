package org.neutral_networks.ie;

class Phone {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Apple extends Phone {
    public Apple(String name) {
        super(name);
    }
}

class Samsung extends Phone {
    public Samsung(String name) {
        super(name);
    }
}

public class polymorphism {
    Phone myPhone = new Phone("Nokia");
    Apple myApples = new Apple("Apple 11");
    Samsung mySamsung = new Samsung("Samsung A50");

    public void display() {
        System.out.println("Name: " + myPhone.getName());
        System.out.println("appleName: " + myApples.getName());
        System.out.println("samsungName: " + mySamsung.getName());
    }
}
