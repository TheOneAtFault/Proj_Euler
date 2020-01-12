package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList array = new ArrayList();
            System.out.println("enter one:");
            int one = scanner.nextInt();
            System.out.println("enter two:");
            int two = scanner.nextInt();
            System.out.println("enter range:");
            int range = scanner.nextInt();
            int total = 0;
            for (int i = 0; i < range; i++) {
                if (i % one == 0 || i % two == 0) {
                    total = total + i;
                    array.add(i);
                }
            }
            System.out.println(total);
            System.out.println(array.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
