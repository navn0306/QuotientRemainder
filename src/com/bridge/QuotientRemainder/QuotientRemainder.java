package com.bridge.QuotientRemainder;
import java.util.*;
public class QuotientRemainder {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the divisor and divident: ");

        int divisor = sc.nextInt();
        int divident = sc.nextInt();

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient value:" + quotient);
        System.out.println("Remainder value:" + remainder);
    }
}