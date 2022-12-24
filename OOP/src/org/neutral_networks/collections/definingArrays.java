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
    }

}
