package org.neutral_networks.concurrency_Exceptions.Exceptions;

public class AirthmeticException {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;

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
    }

}
