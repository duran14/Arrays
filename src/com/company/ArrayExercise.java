package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
//mechanic();
//distance();
        // multiplic();
        //RandomNumbers();
    }

    public static void distance() {
        //this method will accept values from user, store the values in an array, compute the average

        //declare array
        int[] scores = new int[5];
        //declare all the other variables
        int sum = 0;
        double average;
        double distance;
        Scanner ac = new Scanner(System.in);

        //accept from user

        for (int i = 0; i < scores.length; ++i) {
            System.out.print("enter the score :");
            scores[i] = ac.nextInt();
            sum = sum + scores[i];


        }
        //compute the average
        average = sum / scores.length;
//display average
        System.out.println("the average is " + average);
        //display header
        System.out.println("Scores\tDistance to average");

        //compute the distance and display the results

        for (int i = 0; i < scores.length; ++i) {
            distance = Math.abs(average - scores[i]);
            System.out.println(scores[i] + "\t\t\t" + distance);
        }
    }

    public static void mechanic() {
        //this method is going to accept services from user and retuen price
        // it will use parallel arrays

        //declare array
        //parallel array
        String[] Services = {"Oil change ", "tire rotation", "Battery check ", "brakes inspection"};
        int[] Price = {20, 50, 70, 100};

        String Service;
        int priceNum = 0;

        Scanner ac = new Scanner(System.in);        
//getting input from user
        System.out.println("our services are ");
//looping to display services
        for (int i = 0; i < Services.length; ++i) {
            System.out.println(Services[i]);
        }

        System.out.println("choose your service");
        Service = ac.nextLine();
        //looping services to get the price
        for (int i = 0; i < Services.length; ++i) {
            if (Services[i].equals(Service)) {
                priceNum = Price[i];
            }
        }
        System.out.println("Your total is " + priceNum);
    }

    //understand matrix
    public static void multiplic() {
        //declare the variables
        int m1 = 0, m2 = 0, p = 0;
        int[][] table = new int[5][5];
        // put values inside the matrix
        for (int i = 0; i < 5; ++i) {
            m2 = 1;
            ++m1;
            for (int g = 0; g < 5; ++g) {
                p = m1 * m2;
                ++m2;
                table[i][g] = p;

            }

        }
        //display matrix
        for (int i = 0; i < 5; ++i) {
            System.out.println();
            for (int g = 0; g < 5; ++g) {
                System.out.print("\t " + table[i][g]);
            }
        }
    }
}
