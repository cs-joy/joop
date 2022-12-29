package org.neutral_networks.interfaceAbstractClass;

public class FossilFuelCar implements CarInterface {
    private String name;

    public FossilFuelCar(String name) {
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
        System.out.println(this);
        System.out.println("Explosion in cylinder caused the engine start..");
    }

    @Override
    public void move(int speeed) {
        System.out.println(this.getName() + " is moving at " + speeed + "mph");
    }
}
