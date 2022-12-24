package org.neutral_networks.collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // using user define object as a type of ArrayList
        ArrayList<Student> aub_students = new ArrayList<>();

        // add element into arraylist
        aub_students.add(new Student(202010019, "Md. Zahangir Alam", "CSE"));
        aub_students.add(new Student(202210123, "Md. Nayem Hasan", "BBA"));
        aub_students.add(new Student(202010034, "Nayem Nobita", "CSE"));
        aub_students.add(new Student(202110310, "Khairul Alam", "ENG"));
        aub_students.add(new Student(201910001, "Md. Nosib Alam", "CSE"));

        // print out all the elements in the array list using for each loop
        for(Student s: aub_students) {
            System.out.println(s.getName());
        }
    }
}
