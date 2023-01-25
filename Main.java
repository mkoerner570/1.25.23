//package edu.cscc

import java.util.*;
import java.util.Scanner;

class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        // System.out.println("hello world!");
        int year;
        String result;

        System.out.println("Leap year calculator \n please enter a year: ");
        year = input.nextInt();
        // System.out.println(year % 4);

        if (year % 4 == 0){
            System.out.println("It is a leap year!");
        }

    }
}