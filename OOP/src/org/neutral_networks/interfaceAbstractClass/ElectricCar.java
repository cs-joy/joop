package org.neutral_networks.interfaceAbstractClass;

public class ElectricCar implements CarInterface {
    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        // print out the class
        System.out.println(this);
        System.out.println("Electricity Flow started...");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is move at " + speed + "mph");
    }
}
