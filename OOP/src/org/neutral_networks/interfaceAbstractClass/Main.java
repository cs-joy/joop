package org.neutral_networks.interfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(90);

        List<String> names = new ArrayList<>();
    }
}
