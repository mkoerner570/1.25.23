//package edu.cscc

import java.util.*;
import java.util.Scanner;

class Speedy {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        long speed, speed_limit, diff, fine;

        System.out.println("Enter the speed limit: ");
        speed_limit = input.nextLong();
        System.out.println("Enter speed of the vehicle: ");
        speed = input.nextLong();

        diff = speed - speed_limit;

        if (diff > 40){
            fine = 500;
        } else if (diff <= 40 && diff >= 31){
            fine = 250;
        } else if (diff <= 30 && diff >= 21){
            fine = 100;
        } else if (diff <= 20 && diff >= 11){
            fine = 50;
        } else if (diff <=10 && diff >= 0){
            fine = 25;
        }else {
            fine = 0;
        }

        if(fine > 0){
            System.out.println("Your fine is: $" + fine);
        } else {
            System.out.println("No fine.");
        }
    }
}