package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcuMe());
    }

    private static int calcuMe(){
        int currentMax = 1;
        int latter = 0;
        int totalSum = 0;
        while(currentMax <= 4000000){
            int newCurrentMax = currentMax + latter;
            latter = currentMax;
            currentMax = newCurrentMax;
            if((currentMax % 2) == 0){
                totalSum += currentMax;
            }
        }
        return totalSum;
    }
}
