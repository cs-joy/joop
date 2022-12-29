package org.neutral_networks.concurrency_Exceptions.Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

        //System.out.println(a/b);

        // except only arithmetic exception to use "ArithmeticException"
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("b was zero");
        }

        // except all the exceptions to use "Exception"
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("B was zero");
        }

        // NullPointerException
        String name = null;
        //System.out.println(name.equals("AJ"));
        try {
            System.out.println(name.equals("AJ"));
        } catch (NullPointerException e) {
            e.printStackTrace(); // this message only for debugging purposes
            System.out.println("name was null");
        }
    }

}
