package org.neutral_networks.oop3;

public class Final {
    public static void main(String[] args) {
        // definition of final keyword

        // general formation to declare variable
        int number = 5;
        number = number + 4;
        System.out.println(number);

        // declare final type variable
        // final means we can not update the value of a variable
        final int num = 3; // here we assign the value 3, that means this is final and `num` variable ensure that it's not possible to change with a new value
        //num = num + 1; // generate error/ warning!!
        System.out.println(num);


        // final in function or in object declaration
        final Engine eng = new Engine("Renta", 8000);
        //eng = new Engine("Tesla", 10500); // we can't do that
        System.out.println("RPM: " + eng.getRpm());

        // but we can change/modified/update the properties of the declaration of `final` object
        // for example:
        // we can call the setRPM() method to update the value 8000 to 5050 or any of method can be called
        eng.setRpm(5050);
        System.out.println("RPM: " + eng.getRpm());

    }
}
