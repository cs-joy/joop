package org.neutral_networks.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[5]; // where 5 is the size of names array

        String[] department = {"CSE", "BBA", "ENG", "LAW", "IT", "ISLAM"};
        System.out.println(department[5]);

        // if we declare the array in this way,, there have limitation
        // and one of the limitation is
        // we can't add new values in a array
        // for example
        //department[6] = "BANGLA"; // generate error: ArrayIndexOutOfBoundsException
        // we can not do that so this is the one of limitation to define the array in this way
        //System.out.println(department[5]);

        // so how we append or add new elements in the array
        // there have one way to do that, that is
        // created a new array and copy those elements to the new array after that append your new elements to the new array

        // create new array with new index
        String[] updateDepartment = new String[7];
        // copy all elements to the new array
        for(int i=0; i<department.length; i++) {
            updateDepartment[i] = department[i];
        }

        // now append the value at index 6
        updateDepartment[6] = "BANGLA";
        System.out.println(updateDepartment[6]);

        // this solution is not much effective because if in that array have lots of elements like(1 million)
        // then inside of this process have lots of code and copy and pasting thing is good anyway, and when
        // peoples are downloading this information's from the array it will take much time
        // and that's why this is not effective or efficient solution

        /////////////////////////////////////////////////////////////////
        // so we should need to get efficient solution and that's why we use `Collections`
        // there have multiple kinds of Collections in java

        // the first of is:
        ArrayList<String> students = new ArrayList<>(); // ArrayList<argument> - argument can not be primitive data type(like, int, double, float, , etc), it might be object type (like, String,.. etc)
        // so if we declare number list then we should use java class as a type of the array list
        // like:: ArrayList<Integer> number = new ArrayList<>(); // this will be hold all the integer numbers
        // so,, same as for other primitive types,, for example::
        //    :: ArrayList<Double> doubleNumbers = new ArrayList<>();
        //    :: ArrayList<Long> LongNumbers = new ArrayList<>();
        //    :: ArrayList<Boolean> BooleanNumbers = new ArrayList<>();
        //    :: ArrayList<Float> FloatNumbers = new ArrayList<>();

        // now add elements to the array list
        students.add("Jim");
        students.add("Kally");
        students.add("Brad");
        // access elements
        System.out.println(students.get(1)); // print "Kally"
        // get size of the array list
        System.out.println("Size of the array list: " + students.size());
        // clear or remove all the element inside the array list using clear()
//        students.clear();
        System.out.println("Size of the array list: " + students.size());
        // as well as we can remove a single element from the array list using remove()
        students.remove("Kally"); // so remove the "Kally" element from the list
        System.out.println(students.get(1)); // print "Brad" as index 1
        // others function in array list
        System.out.println(students.contains("Kally")); // should return false because in student array list haven't "Kally" element so return it false otherwise if element is present in that array list it will return true
        // like
        System.out.println(students.contains("Brad"));
        // check is the array list is empty or not
        // using isEmpty() and it should return boolean value
        System.out.println(students.isEmpty()); // return false because in the students array list have elements
        // get index number of an element in the array list
        System.out.println(students.indexOf("Jim")); // should return 0
        // but if the given element are not in the array list this always should return -1
        System.out.println(students.indexOf("Kally")); // return -1
        // set element at specific index in the array list
        students.set(1, "Jerry");
        System.out.println(students.get(1));

        // printing all the elements in the array list
        ArrayList<String> aub_dept = new ArrayList<>();
        aub_dept.add("ISLAM");
        aub_dept.add("CSE");
        aub_dept.add("ENG");
        aub_dept.add("LAW");
        aub_dept.add("IT");
        aub_dept.add("BBA");
        aub_dept.add("BANGLA");

        for(int i=0; i<aub_dept.size(); i++) {
            System.out.println(aub_dept.get(i));
        }

        // there is another way:
        List<String> employeers = new ArrayList<>();

        ///////////////////////////////////////
        // -- ok, that's enought talking about ArrayList collection -- //
        ///////////////////////////////////////





        // there have another Collection in java
        // and this is "Maps", when you have some `key`-`value` pair data
        Map<String, String> contact = new HashMap<>(); //<String, String> String type `Key` and also String type `Value`

        // for more to check second file called `MapCollection`


    }

}
