package org.neutral_networks.interfaceAbstractClass;

import org.neutral_networks.oop3.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(90);

        // take a closer look at this line of code: List<String> names = new ArrayList<>();

        //
        CarInterface fossilfuelCarInterface = new FossilFuelCar("Mercedes");
        fossilfuelCarInterface.start();
        fossilfuelCarInterface.move(35);
    }
}
