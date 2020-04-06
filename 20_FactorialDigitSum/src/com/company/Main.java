package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        //Factorial: 4! => 1x2x3x4 = 24
        //Sum of 4! => 2+4 = 6
        //Find the sum of n (100) => will overrun need to use BigInteger

        int n = scanner.nextInt();
        BigInteger biggy = BigInteger.ONE;

        for(int i = 2;i <= n; i++){
            biggy = biggy.multiply(BigInteger.valueOf(i));
        }

        //like a noob
        String asString = biggy.toString();
        int[] digits = new int[asString.length()];
        int sum = 0;
        for (int i = 0; i < asString.length(); i++){
            sum = sum + Character.getNumericValue(asString.charAt(i));
        }
        System.out.println(sum);
        scanner.nextInt();
    }
}
