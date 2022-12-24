package org.neutral_networks.collections;

public class definingArrays {
    public static void main(String[] args) {
        String[] names = new String[5]; // where 5 is the size of names array

        String[] department = {"CSE", "BBA", "ENG", "LAW", "IT", "ISLAM"};
        System.out.println(department[5]);

        // if we declare the array in this way,, there have limitation
        // and one of the limitation is
        // we can't add new values in a array
        // for example
        //department[6] = "MBA"; // generate error: ArrayIndexOutOfBoundsException
        // we can not do that so this is the one of limitation to define the array in this way
        //System.out.println(department[5]);
    }

}
