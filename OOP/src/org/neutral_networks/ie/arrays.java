package org.neutral_networks.ie;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        System.out.println("Hello Arrays!");
//
//        String[] students = new String[5];
//
//        students[0] = "Meisam";
//        students[1] = "John";
//        students[2] = "Doe";
//        students[3] = "Kally";
//        students[4] = "Kelvin";
//        //students[5] = "Cluster";
//
//        //System.out.println(students[5]); error
//
//        System.out.println(students[3]);
//
//        for(int i=0; i<5; i++)
//        {
//            System.out.println(students[i]);
//        }
//
//        String[] employees = {"Tom", "Jerry", "Mike", "Doe"};
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int size = numbers.length;
//
//        for(int i=0; i<size; i++)
//        {
//            System.out.println(numbers[i]);
//        }


        // next application
        String[] names = {"Meisam", "Jerry", "Tom", "Doe", "Kelvin", "Mike", "Gilbart" ,"Strang", "Kally"};
        int[] numbers = {234445, 654376, 123451, 163890, 104297, 210601, 254104, 134023, 106734};

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        for(int i=0; i<names.length; i++){
            if(name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}

